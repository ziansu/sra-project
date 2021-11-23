public void run() {
    edu.brown.benchmark.voteresper.tuples.PhoneCall pc = generator.receive();
    if (pc != null)
        cep.getEPRuntime().sendEvent(pc);
    
}