@java.lang.Override
public void init(net.sickill.off.common.OffListModel model) {
    this.model = model;
    final java.util.List<java.lang.String> sourceGroups = java.util.Collections.singletonList(net.sickill.off.FakeProject.PROJECT_ROOT);
    java.lang.String projectRootDir = net.sickill.off.FakeProject.PROJECT_ROOT;
    this.model.reinit(sourceGroups);
    for (net.sickill.off.common.ProjectFile pf : col) {
        this.model.addFile(pf);
    }
}