public void addComment(org.mybatis.generator.api.dom.xml.XmlElement xmlElement) {
    if (this.suppressAllComments) {
        return ;
    }
    xmlElement.addElement(new org.mybatis.generator.api.dom.xml.TextElement("<!--"));
    java.lang.String s = getDateString();
    if (s != null) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("  This file was generated on ");
        sb.append(s);
        sb.append('.');
        xmlElement.addElement(new org.mybatis.generator.api.dom.xml.TextElement(sb.toString()));
    }
    xmlElement.addElement(new org.mybatis.generator.api.dom.xml.TextElement("-->"));
}