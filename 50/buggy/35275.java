public java.lang.String getAuthorDisplay() {
    java.util.List<org.marc4j.marc.DataField> list = record.getDataFields("100");
    if (list.isEmpty())
        return null;
    
    org.marc4j.marc.DataField df = list.get(0);
    return removeEndPunctuation(changeName(df));
}