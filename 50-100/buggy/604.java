@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    m_parentComposite = parent;
    addResizeListener(parent);
    if ((getWatchResultDirectory()) != null) {
        updateResultThread();
    }
    org.eclipse.jface.layout.GridLayoutFactory.fillDefaults().applyTo(m_parentComposite);
    configureToolBar();
    createProgressCountPanel(m_parentComposite);
    m_tabFolder = createTestRunTabs(m_parentComposite);
    org.testng.eclipse.TestNGPlugin.getDefault().getPreferenceStore().addPropertyChangeListener(this);
    if ((m_stateMemento) != null) {
        restoreLayoutState(m_stateMemento);
    }
    m_stateMemento = null;
}