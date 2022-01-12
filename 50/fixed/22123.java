public void addName(java.lang.String name) {
    content.add(name);
    java.util.Collections.sort(content);
    notifyDataSetChanged();
    setNoContent();
}