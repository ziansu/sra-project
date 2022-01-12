@java.lang.Override
public void runTask() {
    this.processFiles(fileManager.localTvDataFiles(com.google.common.base.Predicates.<java.io.File>alwaysTrue()), true);
}