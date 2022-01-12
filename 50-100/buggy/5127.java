private static java.lang.String getTag(java.lang.String msg, java.lang.String tag) {
    java.lang.String[] tags = msg.split("/");
    for (int i = 0; i < (tags.length); i++) {
        java.lang.String[] flag = tags[i].split(":");
        if (flag[0].equals(tag)) {
            return flag[1];
        }
    }
    return null;
}