private java.lang.String getXmlAttribute(android.content.res.XmlResourceParser xml, java.lang.String name) {
    int resId = xml.getAttributeResourceValue(null, name, 0);
    if (resId == 0) {
        return xml.getAttributeValue(null, name);
    }else {
        return context.getString(resId);
    }
}