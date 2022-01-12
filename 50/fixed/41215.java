public void setList() {
    this.filteList.clear();
    this.filteList.addAll(this.list);
    notifyDataSetChanged();
}