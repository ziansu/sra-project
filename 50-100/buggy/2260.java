@java.lang.Override
public org.eclipse.swt.widgets.Composite createContents(org.eclipse.swt.widgets.Composite parent) {
    org.eclipse.swt.widgets.Composite page = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
    org.eclipse.swt.layout.GridLayout gridLayout = new org.eclipse.swt.layout.GridLayout();
    gridLayout.numColumns = 1;
    page.setLayout(gridLayout);
    createFileEditorForPlayerTemplate(page, PreferenceConstants.TEMPLATE_SECOND_PLAYER_FILE, "Player 2 Template: ");
    createSquadTemplatesTable(page);
    return page;
}