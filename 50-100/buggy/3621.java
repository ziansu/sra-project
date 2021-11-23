@java.lang.Override
public void performAction() {
    if (isRef) {
        refShuttle.setSelected(true);
        refBar.replaceLevels(refShuttle.getBarLevel());
    }else {
        refShuttle.setSelected((!(refShuttle.isSelected())));
    }
    if (refShuttle.isSelected())
        gameCamera.lookAt(refShuttle);
    
}