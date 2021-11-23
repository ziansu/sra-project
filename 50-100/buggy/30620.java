public void Handle(CarAgent.CarAgent agent, jade.lang.acl.ACLMessage original) {
    java.lang.System.out.println(((agent.getLocalName()) + ": Destination request handled"));
    if (!(agent.isInMove())) {
        handleCarAvailable(agent, original);
    }else {
        rejectRequest(agent);
    }
}