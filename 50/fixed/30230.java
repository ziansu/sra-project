public static java.lang.String getValueText_Signed(float value) {
    java.lang.String signText = "";
    if (value >= 0) {
        signText += "+";
    }
    return signText + (amara.applications.ingame.client.gui.GUIUtil.getValueText(value));
}