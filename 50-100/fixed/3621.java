@java.lang.Override
public void performAction() {
    if (isRef) {
        refShuttle.setSelected(true);
    }else {
        refShuttle.setSelected((!(refShuttle.isSelected())));
    }
    if (refShuttle.isSelected())
        gameCamera.lookAt(refShuttle);
    
}