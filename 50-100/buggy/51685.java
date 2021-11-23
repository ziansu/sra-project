@java.lang.Override
public void onClick(android.view.View v) {
    equationText += "+";
    if ((buttonX.isSelected()) && (!(buttonExp.isSelected()))) {
        exponent[exponentIndex] = 1;
        (exponentIndex)++;
    }
    updateButtonStatusOnAddSub(false);
    eqTextView.setText(android.text.Html.fromHtml(equationText));
}