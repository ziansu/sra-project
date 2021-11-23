public <T> T unmarshallUtil(java.lang.String xmlPath, java.lang.Class<T> entityClass) throws java.lang.Exception {
    javax.xml.bind.JAXBContext cxt = javax.xml.bind.JAXBContext.newInstance(entityClass);
    javax.xml.bind.Unmarshaller unmarshaller = cxt.createUnmarshaller();
    java.io.File file = new java.io.File(((com.quangphuong.crawler.util.XMLUtil.rootPath) + xmlPath));
    T result = ((T) (unmarshaller.unmarshal(file)));
    return result;
}