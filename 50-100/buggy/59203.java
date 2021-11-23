@java.lang.Override
protected org.eclipse.swt.widgets.Composite doCreateControl(org.eclipse.swt.widgets.Composite root) {
    org.eclipse.swt.widgets.Composite parent = com.tibco.bw.design.field.BWFieldFactory.getInstance().createComposite(root, 2);
    com.tibco.bw.design.field.BWFieldFactory.getInstance().createLabel(parent, "Connection", true);
    propField = com.tibco.bw.design.field.BWFieldFactory.getInstance().createPropertyField(parent, BWDesignConstants.PROPERTY, HTTP_QNAME);
    propField.setDefaultPropertyPrefix("jira");
    com.tibco.bw.design.field.BWFieldFactory.getInstance().createLabel(parent, "OutputFields", true);
    textField = com.tibco.bw.design.field.BWFieldFactory.getInstance().createTextBox(parent);
    return parent;
}