public msi.gama.util.GamaMap<java.lang.String, java.lang.String> fetchMessageBox(msi.gama.metamodel.agent.IAgent agt) {
    java.util.LinkedList<java.util.Map<java.lang.String, java.lang.String>> box = this.receivedMessage.get(agt);
    if (box.isEmpty())
        return null;
    
    java.util.Map<java.lang.String, java.lang.String> data = box.getFirst();
    box.removeFirst();
    return msi.gama.util.GamaMapFactory.create(agt.getScope(), Types.STRING, Types.STRING, data);
}