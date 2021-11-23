public java.lang.String getTag() {
    java.lang.String str = "";
    int count = 0;
    for (java.lang.String s : tagList) {
        count++;
        if (count == (tagList.size())) {
            str = str + s;
        }else {
            str = (str + s) + ",";
        }
    }
    return str;
}