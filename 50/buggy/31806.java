private javax.swing.text.JTextComponent getCurrentTextComponent() {
    java.awt.Component currentComponent = getCurrentComponent();
    if ((currentComponent != null) && (currentComponent instanceof javax.swing.text.JTextComponent)) {
        return ((javax.swing.text.JTextComponent) (currentComponent));
    }else {
        return null;
    }
}