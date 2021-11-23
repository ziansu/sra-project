public void setSections(java.lang.String sections) {
    if ((sections != null) && (!(sections.isEmpty())))
        putParam("fq", java.lang.String.format("section_name:(%s)", sections));
    
}