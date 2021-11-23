public sosconnector.XML.XmlTemplate[] getXmlTemplateGroup() {
    int index = 0;
    this.hashGroup = reload();
    sosconnector.XML.XmlTemplate[] xmlTemplates = new sosconnector.XML.XmlTemplate[hashGroup.size()];
    for (java.util.LinkedHashMap hash : hashGroup)
        xmlTemplates[(index++)] = makeXmlTemplate(hash);
    
    return xmlTemplates;
}