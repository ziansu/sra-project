protected boolean hasChild(java.lang.String childName) {
    return (children.containsKey(childName)) && (children.get(childName).isParsed());
}