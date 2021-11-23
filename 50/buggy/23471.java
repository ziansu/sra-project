public void addType(java.lang.String type) {
    mTypes.append(type);
    mTypes.append("|");
    mTypes.deleteCharAt(((mTypes.length()) - 1));
}