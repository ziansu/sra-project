public java.util.List<java.lang.String> getAuthor2Display() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (org.marc4j.marc.DataField df : record.getDataFields("700")) {
        result.add(removeEndPunctuation(changeName(df)));
    }
    result.addAll(getFields("110ab:111ab:710ab:711ab"));
    return result;
}