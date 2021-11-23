@java.lang.Override
public void onClick(android.view.View v) {
    if (buttonExp.isSelected()) {
        equationText += "<sup>6</sup>";
        exponent[exponentIndex] = 6;
        (exponentIndex)++;
        updateButtonStatusAfterExponent();
    }else {
        equationText += "6";
    }
    eqTextView.setText(android.text.Html.fromHtml(equationText));
}