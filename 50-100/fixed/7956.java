@java.lang.Override
protected void showInformationControl(org.eclipse.swt.graphics.Rectangle subjectArea) {
    super.showInformationControl(subjectArea);
    org.eclipse.jface.internal.text.InternalAccessor accessor = getInternalAccessor();
    org.eclipse.jface.text.IInformationControl iControl = accessor.getCurrentInformationControl();
    if ((iControl != null) && ((fInformationControlCloser) != null)) {
    }
}