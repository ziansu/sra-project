private java.lang.String listToConfig(java.util.ArrayList<mars.client.Module> list) {
    java.lang.StringBuilder aStringBuilder = new java.lang.StringBuilder();
    aStringBuilder.append("[");
    for (int i = 0; i < (list.size()); i++) {
        aStringBuilder.append(list.get(i).toString()).append(",");
    }
    aStringBuilder.deleteCharAt(aStringBuilder.length());
    aStringBuilder.append("]");
    return aStringBuilder.toString();
}