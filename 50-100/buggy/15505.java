public boolean isWithAllAttributesFilled() {
    java.util.Set<java.lang.String> keySet = this.responseMap.keySet();
    if ((keySet.size()) == (this.replyAttributes.length)) {
        keySet.removeAll(java.util.Arrays.asList(this.replyAttributes));
        return (keySet.size()) == 0;
    }
    return false;
}