@java.lang.Override
public java.lang.String getContent(com.google.gwt.dom.client.Element element) {
    @java.lang.SuppressWarnings(value = "boxing")
    int absoluteRowIndex = java.lang.Integer.valueOf(com.google.gwt.query.client.GQuery.$(element).attr("__gwt_row"));
    if ((rowNum) == absoluteRowIndex)
        return hoveredCourseDetail;
    
    return "Loading...";
}