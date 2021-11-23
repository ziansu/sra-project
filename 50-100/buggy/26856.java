public net.sharkfw.asip.ASIPInformationSpace getInformationSpace(net.sharkfw.asip.ASIPSpace space) throws net.sharkfw.knowledgeBase.inmemory.SharkKBException {
    while (informationSpaces().hasNext()) {
        net.sharkfw.asip.ASIPInformationSpace current = informationSpaces().next();
        if (net.sharkfw.knowledgeBase.inmemory.SharkCSAlgebra.identical(current.getASIPSpace(), space)) {
            return current;
        }
    } 
    return null;
}