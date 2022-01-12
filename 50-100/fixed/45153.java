@java.lang.Override
public void run() {
    java.lang.String hexColor = textFieldHexColor.getText();
    int length = hexColor.length();
    if (((!(co.lujun.colorpanelhelper.ColorPanel.isHexNumber(hexColor))) || (length < 6)) || (length > 8)) {
        return ;
    }
    java.lang.String alphaHexStr = hexColor.substring(0, (length - 6));
    invalidateUI(convertHexStr2AlphaValue(alphaHexStr), hexColor, false);
}