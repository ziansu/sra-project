public void handleOkClick() {
    if (this.isValidClass(jTextFieldCustomizeClass)) {
        setClassSelected(jTextFieldCustomizeClass.getText().trim());
        setCanceled(false);
        setVisible(false);
    }else {
        java.lang.System.out.println(((((agentgui.core.application.Language.translate("Class not found:")) + " '") + (jTextFieldCustomizeClass.getText())) + "'"));
    }
}