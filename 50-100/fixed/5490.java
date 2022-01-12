@java.lang.Override
public void modify(java.lang.Object element, java.lang.String property, java.lang.Object value) {
    if (element instanceof org.eclipse.swt.widgets.Widget) {
        element = ((org.eclipse.swt.widgets.Widget) (element)).getData();
    }
    if (value instanceof org.aludratest.eclipse.vde.model.ITestDataFieldValue) {
        org.aludratest.eclipse.vde.internal.editors.ConfigurationSegmentDetailsFormPart.SegmentField field = ((org.aludratest.eclipse.vde.internal.editors.ConfigurationSegmentDetailsFormPart.SegmentField) (element));
        field.fieldValue = ((org.aludratest.eclipse.vde.model.ITestDataFieldValue) (value));
        tvFields.update(element, null);
    }
}