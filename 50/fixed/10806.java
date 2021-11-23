public void setSelected(int selected) {
    if ((selected == (mSelected)) && (selected == (this.selected))) {
        return ;
    }
    mSelected = selected;
    setSelection(mSelected);
}