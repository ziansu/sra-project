@java.lang.Override
protected void addListeners() {
    super.addListeners();
    if ((jobTypeCCombo) != null) {
        jobTypeCCombo.addModifyListener(new org.eclipse.swt.events.ModifyListener() {
            @java.lang.Override
            public void modifyText(final org.eclipse.swt.events.ModifyEvent e) {
                org.talend.core.repository.utils.ConvertJobsUtil.updateJobFrameworkPart(jobTypeCCombo.getText(), framework);
                updatePageStatus();
            }
        });
    }
    if ((framework) != null) {
        framework.addModifyListener(new org.eclipse.swt.events.ModifyListener() {
            @java.lang.Override
            public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
                updatePageStatus();
            }
        });
    }
}