@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    int alphaValue = sliderAlpha.getValue();
    java.lang.String hexColor = textFieldHexColor.getText();
    if ((hexColor.length()) > 6) {
        hexColor = (convertAlphaValue2HexStr(alphaValue)) + (hexColor.substring(((hexColor.length()) - 6)));
    }else {
        hexColor = (convertAlphaValue2HexStr(alphaValue)) + hexColor;
    }
    invalidateUI(alphaValue, hexColor);
}