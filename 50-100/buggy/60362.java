@org.junit.Before
public void setUp() {
    parent = com.codeaffine.eclipse.swt.test.util.ShellHelper.createShell(displayHelper);
    scrollable = com.codeaffine.eclipse.swt.widget.scrollable.TreeHelper.createTree(parent, 1, 1);
    adapter = new com.codeaffine.eclipse.swt.widget.scrollable.ScrollableAdapterFactory().create(scrollable, com.codeaffine.eclipse.swt.widget.scrollable.TreeAdapter.class);
    reconciliation = new com.codeaffine.eclipse.swt.widget.scrollable.LayoutReconciliation(adapter, scrollable);
}