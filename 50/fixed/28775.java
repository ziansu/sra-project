public void update(java.util.List<T> data) {
    this.data = new java.util.ArrayList<T>(data);
    notifyDataSetChanged();
}