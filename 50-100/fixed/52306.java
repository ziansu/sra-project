public javax.xml.bind.JAXBContext getJAXBContextForClass(java.lang.Class cl) throws javax.xml.bind.JAXBException {
    if (getContextMap().containsKey(cl.getName())) {
        return getContextMap().get(cl.getName());
    }else {
        javax.xml.bind.JAXBContext newInstance = javax.xml.bind.JAXBContext.newInstance(cl);
        getContextMap().put(cl.getName(), newInstance);
    }
    return getContextMap().get(cl.getName());
}