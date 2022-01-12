private int get_last_speech_index() {
    nu.xom.Element s = get_last_tag("s");
    if ((s == null) || ((s.getAttribute("k")) == null))
        return 0;
    
    return java.lang.Integer.valueOf(s.getAttributeValue("k"));
}