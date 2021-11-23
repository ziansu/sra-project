public void removeFirst() {
    if ((getCount()) > 0) {
        slm2015.hey.entity.Issue issue = this.filteList.get(((this.getCount()) - 1));
        this.filteList.remove(issue);
        this.list.remove(issue);
        this.notifyDataSetChanged();
    }
}