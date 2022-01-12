public boolean setID(java.lang.String id) {
    if ((stsquestbuilder.model.ConversationNode.strIdMap.containsKey(id)) && (((ID.get()) == null) || (!(ID.get().equals(id)))))
        return false;
    
    ID.set(id);
    stsquestbuilder.model.ConversationNode.strIdMap.put(id, this);
    return true;
}