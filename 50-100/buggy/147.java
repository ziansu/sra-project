public void setButtonState(android.widget.Button button, boolean selected) {
    if (button == null) {
        return ;
    }
    button.setSelected(selected);
    if (selected) {
        button.setBackgroundResource(R.drawable.button_pressed);
        button.setTextAppearance(this.context, R.style.WhiteBoldText);
    }else {
        button.setBackgroundResource(R.drawable.button_not_pressed);
        button.setTextAppearance(this.context, R.style.PrimaryNormalText);
    }
}