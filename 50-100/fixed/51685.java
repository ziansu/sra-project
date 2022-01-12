@java.lang.Override
public void onClick(android.view.View v) {
    equationText += "+";
    if (((buttonX.isSelected()) == true) && ((buttonExp.isSelected()) == false)) {
        exponent[exponentIndex] = 1;
        (exponentIndex)++;
    }
    updateButtonStatusOnAddSub(false);
    eqTextView.setText(android.text.Html.fromHtml(equationText));
}