public static boolean isWarning(java.lang.String receivedString) {
    return ((receivedString.length()) > 7) && (receivedString.substring(0, 7).equals(udo.gui.GuiUtil.PREFIX_WARNING));
}