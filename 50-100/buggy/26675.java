public android.content.ContentValues toContentValue() {
    android.content.ContentValues values = new android.content.ContentValues();
    java.lang.String name = getUrl();
    int index = name.lastIndexOf("/");
    name = name.substring(index, ((name.length()) - 1));
    values.put("name", name);
    values.put("url", this.getUrl());
    return values;
}