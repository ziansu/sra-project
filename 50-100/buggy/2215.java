public synchronized boolean addFamilyAndObjectType(scouter.lang.Family family, scouter.lang.ObjectType objectType) {
    org.w3c.dom.Document doc = appendFamily(family, getCustomDocument());
    doc = appendObjectType(objectType, doc);
    if (doc != null) {
        scouter.server.util.XmlUtil.writeXmlFileWithIndent(doc, customFile, 2);
        xmlCustomContent = scouter.util.FileUtil.readAll(customFile);
        reloadEngine();
        return true;
    }
    return false;
}