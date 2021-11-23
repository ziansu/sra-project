private int get_last_speech_index() {
    nu.xom.Element s = get_last_tag("s");
    if (s == null)
        return 0;
    
    if ((s.getAttribute("k")) != null)
        return java.lang.Integer.valueOf(s.getAttributeValue("k"));
    else
        return 0;
    
}