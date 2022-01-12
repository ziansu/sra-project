public net.sharkfw.asip.ASIPInformationSpace getInformationSpace(net.sharkfw.asip.ASIPSpace space) throws net.sharkfw.knowledgeBase.inmemory.SharkKBException {
    java.util.Iterator<net.sharkfw.asip.ASIPInformationSpace> iterator = informationSpaces();
    while (iterator.hasNext()) {
        net.sharkfw.asip.ASIPInformationSpace current = iterator.next();
        if (net.sharkfw.knowledgeBase.inmemory.SharkCSAlgebra.identical(current.getASIPSpace(), space)) {
            return current;
        }
    } 
    return null;
}