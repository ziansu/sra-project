private void updateExactMatchOptions() {
    org.eclipse.swt.widgets.Button caseBtn = optionsButtons.get(org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.Case_Sensitive.asLabel());
    org.eclipse.swt.widgets.Button mwoBtn = optionsButtons.get(org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.Match_Word_Order.asLabel());
    boolean exactMatch = isExactMatchEnabled();
    caseBtn.setEnabled((!exactMatch));
    mwoBtn.setEnabled((!exactMatch));
}