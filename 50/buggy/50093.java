@java.lang.Override
public void run() {
    this.mCurrentBuildRootElement.addChild(mParseProgress);
    this.mTreeModel.reload();
}