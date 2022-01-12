private void initComparators() {
    for (int i = 1; i < 4; i++) {
        final int column = i;
        comparator[i] = new org.eclipse.jface.viewers.ViewerComparator() {
            @java.lang.Override
            public int compare(org.eclipse.jface.viewers.Viewer viewer, java.lang.Object e1, java.lang.Object e2) {
                de.lmu.ifi.dbs.medmon.base.ui.provider.WorkbenchTableLabelProvider lp = ((de.lmu.ifi.dbs.medmon.base.ui.provider.WorkbenchTableLabelProvider) (getLabelProvider()));
                return lp.getColumnText(e1, column).compareTo(lp.getColumnText(e2, column));
            }
        };
    }
}