@java.lang.Override
public void keyPressed() {
    org.eclipse.jface.text.IInformationControl infoControl = getCurrentInformationControl2();
    if ((infoControl != null) && (!(infoControl.isFocusControl()))) {
        hideInformationControl();
    }
}