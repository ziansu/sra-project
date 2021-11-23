public void setList(java.util.List<slm2015.hey.entity.Issue> list) {
    this.list = list;
    this.filteList.clear();
    this.filteList.addAll(list);
    notifyDataSetChanged();
}