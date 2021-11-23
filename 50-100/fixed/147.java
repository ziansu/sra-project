public void setButtonState(android.view.View button, boolean selected) {
    if (button == null) {
        return ;
    }
    button.setSelected(selected);
    if (selected) {
        button.setBackgroundResource(R.drawable.button_pressed);
    }else {
        button.setBackgroundResource(R.drawable.button_not_pressed);
    }
    if (button instanceof android.widget.Button) {
        ((android.widget.Button) (button)).setTextAppearance(this.context, (selected ? R.style.WhiteBoldText : R.style.PrimaryNormalText));
    }
}