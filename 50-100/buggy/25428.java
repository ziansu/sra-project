public void resetCheck() {
    for (int i = 0; i < (getGroup().size()); i++) {
        getGroup().get(i).setCheck(false);
    }
    this.notifyDataSetChanged();
}