private javax.swing.JList getPopupList() {
    javax.swing.plaf.basic.ComboPopup popup = ((javax.swing.plaf.basic.ComboPopup) (getUI().getAccessibleChild(this, 0)));
    return popup.getList();
}