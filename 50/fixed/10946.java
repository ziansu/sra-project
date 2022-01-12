public ListItem head() {
    if (!(this.list.isEmpty())) {
        return this.list.get(0);
    }
    return null;
}