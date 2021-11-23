@java.lang.Override
public void run() {
    this.mBuildProgress.setDetail(message);
    this.mTreeModel.reload();
}