@butterknife.OnClick(value = R.id.adding_incomes_dotBtn)
public void inputDot(android.widget.Button button) {
    java.lang.String[] text = value.split("\\.");
    if (value.contains(".")) {
        return ;
    }
    if ((text.length) == 1) {
        value += ".";
        valueTextView.setText(((value) + "0"));
    }
}