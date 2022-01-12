private java.lang.String getHotTopicListJsonString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("{\"selector\": {");
    sb.append("\"_id\": {\"$gt\": 0},");
    sb.append("\"date\": {\"$gt\": 0},");
    sb.append("\"pin\": {\"$exists\": false},");
    sb.append("\"$and\": [{\"type\":\"host\"}]");
    sb.append("},");
    sb.append("\"fields\": [\"_id\",\"_rev\",\"avatarName\",\"avatarPic\",\"subject\",\"content\",\"date\",\"type\",\"roomId\",\"countLike\"]}");
    return sb.toString();
}