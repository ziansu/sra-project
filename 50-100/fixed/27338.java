public void setStates(boolean[] selected) {
    if ((((this.buttons) == null) || (selected == null)) || ((this.buttons.size()) != (selected.length))) {
        return ;
    }
    int count = 0;
    for (android.view.View b : this.buttons) {
        setButtonState(b, selected[count]);
        count++;
    }
}