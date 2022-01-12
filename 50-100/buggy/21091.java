public java.lang.String getTagsString() {
    java.lang.StringBuilder tagString = new java.lang.StringBuilder();
    java.lang.Boolean morethanone = false;
    for (java.lang.String tag : getTagsList()) {
        if ((tag.trim()) != "") {
            if (morethanone) {
                tagString.append(",");
            }
            tagString.append(tag.trim());
            morethanone = true;
        }
    }
    return tagString.toString();
}