private static java.lang.String getXMLData(java.util.List<java.lang.Integer> actualData) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.Integer character : actualData)
        sb.append(((char) (character.byteValue())));
    
    return sb.toString();
}