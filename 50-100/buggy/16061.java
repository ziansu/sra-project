public void addToTop(java.util.List<org.json.JSONObject> items) {
    java.util.List<org.json.JSONObject> newList = new java.util.ArrayList<>();
    newList.addAll(items);
    newList.addAll(this.items);
    this.items = newList;
    this.cache.cleanSave(this.items);
    notifyDataSetChanged();
}