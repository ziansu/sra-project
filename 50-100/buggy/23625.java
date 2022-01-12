private java.lang.String getAttribute(org.xml.sax.Attributes atts, java.lang.String equation, int index) {
    if (((atts.getLength()) == 0) || (index > (atts.getLength())))
        return null;
    
    boolean condition = atts.getLocalName(index).equals(equation);
    return condition ? atts.getValue(index) : null;
}