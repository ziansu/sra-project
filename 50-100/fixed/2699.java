@android.support.annotation.Nullable
private com.eje_c.meganekko.SceneObject parse(final org.w3c.dom.Element element) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    final com.eje_c.meganekko.SceneObject object = createSceneObject(element);
    if (object == null)
        return null;
    
    parseChildren(element, object);
    com.eje_c.meganekko.xml.XmlDocumentParser.ParserChain chain = new com.eje_c.meganekko.xml.XmlDocumentParser.ParserChain(mContext, mAttributeParsers.iterator(), element, object);
    chain.next();
    return object;
}