private com.chrisrm.idea.ui.MTPasswordFieldUI.PasswordActions getActionUnder(@org.jetbrains.annotations.NotNull
java.awt.Point p) {
    int off = com.intellij.util.ui.JBUI.scale(8);
    java.awt.Point point = new java.awt.Point(((p.x) - off), ((p.y) - off));
    if ((point.distance(getPreviewIconCoord())) <= off) {
        return echoCharIsSet ? com.chrisrm.idea.ui.MTPasswordFieldUI.PasswordActions.PREVIEW : com.chrisrm.idea.ui.MTPasswordFieldUI.PasswordActions.HIDE;
    }
    return null;
}