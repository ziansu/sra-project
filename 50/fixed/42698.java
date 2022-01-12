public void getListData(java.util.List<java.util.Map<java.lang.String, java.lang.String>> users, java.lang.CharSequence constraint) {
    this.users = users;
    notifyDataSetChanged();
    getFilter().filter(constraint);
}