protected boolean matchNameAttribute(javax.swing.text.AttributeSet attr, javax.swing.text.html.HTML.Tag tag) {
    java.lang.Object obj = attr.getAttribute(javax.swing.text.StyleConstants.NameAttribute);
    if (obj instanceof javax.swing.text.html.HTML.Tag) {
        javax.swing.text.html.HTML.Tag name = ((javax.swing.text.html.HTML.Tag) (obj));
        if (name == tag) {
            return true;
        }
    }
    return false;
}