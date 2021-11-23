@java.lang.Override
public void dispose() {
    super.dispose();
    bndtools.central.Central.removeRepositoriesViewer(viewer, this);
}