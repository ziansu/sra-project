@java.lang.Override
public void cleanup() {
    super.cleanup();
    pool.shutdown();
    this.debugsNode.removeFromParent();
}