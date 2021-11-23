public msi.gama.util.GamaMap<java.lang.String, java.lang.Object> fetchMessageBox(msi.gama.metamodel.agent.IAgent agt) {
    java.util.LinkedList<java.util.Map<java.lang.String, java.lang.Object>> box = this.receivedMessage.get(agt);
    if (box.isEmpty())
        return null;
    
    java.util.Map<java.lang.String, java.lang.Object> data = box.getFirst();
    box.removeFirst();
    return null;
}