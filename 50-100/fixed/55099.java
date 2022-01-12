protected com.github.markusbernhardt.xmldoclet.xjc.Root loadJavadocRoot(java.io.InputStream inputStream) {
    try {
        javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(com.github.markusbernhardt.xmldoclet.xjc.Root.class);
        javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
        if ((inputStream != null) && ((unmarshaller.unmarshal(inputStream)) != null)) {
            return ((com.github.markusbernhardt.xmldoclet.xjc.Root) (unmarshaller.unmarshal(inputStream)));
        }else {
            return new com.github.markusbernhardt.xmldoclet.xjc.ObjectFactory().createRoot();
        }
    } catch (javax.xml.bind.JAXBException e) {
        return new com.github.markusbernhardt.xmldoclet.xjc.ObjectFactory().createRoot();
    }
}