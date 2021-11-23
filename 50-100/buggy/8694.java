public void run(gov.sandia.n2a.backend.internal.Euler simulator) {
    java.lang.System.out.println(("EventSpikeMultiLatch " + (t)));
    setFlag();
    for (gov.sandia.n2a.language.type.Instance i : targets)
        simulator.integrate(i);
    
    for (gov.sandia.n2a.language.type.Instance i : targets)
        i.update(simulator);
    
    for (gov.sandia.n2a.language.type.Instance i : targets)
        if (!(i.finish(simulator)))
            i.dequeue();
        
    
}