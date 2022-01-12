@java.lang.Override
public int compare(fi.otavanopisto.muikku.plugins.workspace.model.WorkspaceMaterial o1, fi.otavanopisto.muikku.plugins.workspace.model.WorkspaceMaterial o2) {
    int result = (o1.getParent().getOrderNumber()) - (o2.getParent().getOrderNumber());
    if (result == 0) {
        result = o1.getOrderNumber().compareTo(o2.getOrderNumber());
    }
    return result;
}