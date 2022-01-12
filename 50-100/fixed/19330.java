private de.uniluebeck.itm.tr.xml.Testbed unmarshal(final org.w3c.dom.Node rootNode) throws javax.xml.bind.JAXBException {
    javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(de.uniluebeck.itm.tr.xml.Testbed.class.getPackage().getName());
    javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
    synchronized(rootNode) {
        return unmarshaller.unmarshal(rootNode, de.uniluebeck.itm.tr.xml.Testbed.class).getValue();
    }
}