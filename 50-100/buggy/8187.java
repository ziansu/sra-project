private java.lang.String getAllByIdJsonString(java.lang.String _id) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("{\"selector\": {");
    sb.append("\"_id\": {\"$gt\": 0},");
    sb.append((("\"$and\": [{\"topicId\":\"" + _id) + "\"}]"));
    sb.append("}}");
    java.lang.System.out.println(("query string : " + (sb.toString())));
    return sb.toString();
}