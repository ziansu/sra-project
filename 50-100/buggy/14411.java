@butterknife.OnClick(value = R.id.adding_incomes_dotBtn)
public void inputDot(android.widget.Button button) {
    java.lang.String[] text = value.split("\\.");
    if ((text.length) == 1) {
        if (!(value.contains("."))) {
            value += ".";
        }
    }else
        if ((text[1].length()) == 0) {
            valueTextView.setText(((value) + "0"));
        }
    
}