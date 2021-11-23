@java.lang.Override
public int compare(fi.otavanopisto.muikku.plugins.workspace.model.WorkspaceMaterial o1, fi.otavanopisto.muikku.plugins.workspace.model.WorkspaceMaterial o2) {
    int result = (getParentIndex(o1.getParent())) - (getParentIndex(o2.getParent()));
    if (result == 0) {
        result = o1.getOrderNumber().compareTo(o2.getOrderNumber());
    }
    return result;
}