private java.lang.String getStartDate(org.w3c.dom.Node currentEvent) {
    java.util.ArrayList<java.lang.String> time = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : myTime)
        time.add(getTagValue(currentEvent, (("start/" + s) + "/text()")));
    
    return format(time);
}