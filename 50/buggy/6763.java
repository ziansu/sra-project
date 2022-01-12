public void onFragmentInvisible() {
    if (!(this.fragmentVisible)) {
        return ;
    }
    this.fragmentVisible = false;
    if ((this.adapter) != null) {
        this.adapter.onPause();
    }
}