@java.lang.Override
public boolean select(org.eclipse.jface.viewers.Viewer viewer, java.lang.Object parentElement, java.lang.Object element) {
    if (element instanceof com.kdmanalytics.toif.ui.common.IFindingEntry) {
        if (element instanceof com.kdmanalytics.toif.ui.common.FindingGroup) {
            return true;
        }
        return doesLocationContainTwoSameSFP(((com.kdmanalytics.toif.ui.common.FindingEntry) (element)));
    }
    return false;
}