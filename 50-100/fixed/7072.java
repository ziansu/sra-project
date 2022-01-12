public void turnon() {
    switch (currentState) {
        case SWITCHINGOFF :
        case OFF :
            setState(hu.mta.sztaki.lpds.cloud.simulator.iaas.PhysicalMachine.State.SWITCHINGON);
            if ((onOffEvent) == null) {
                new hu.mta.sztaki.lpds.cloud.simulator.iaas.PhysicalMachine.PowerStateDelayer(onTransition, hu.mta.sztaki.lpds.cloud.simulator.iaas.PhysicalMachine.State.RUNNING);
            }else {
                onOffEvent.addFurtherTasks(onTransition);
                onOffEvent.setNewState(hu.mta.sztaki.lpds.cloud.simulator.iaas.PhysicalMachine.State.RUNNING);
            }
            break;
        case RUNNING :
        case SWITCHINGON :
            java.lang.System.err.println("WARNING: an already running PM was tasked to switch on!");
    }
}