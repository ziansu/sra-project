private java.util.List<org.nlpcn.es4sql.parse.From> findFrom(org.nlpcn.es4sql.parse.SQLTableSource from) {
    java.lang.String[] split = from.getTablename().toString().split(",");
    java.util.ArrayList<org.nlpcn.es4sql.parse.From> fromList = new java.util.ArrayList<>();
    for (java.lang.String source : split) {
        fromList.add(new org.nlpcn.es4sql.parse.From(source.trim()));
    }
    return fromList;
}