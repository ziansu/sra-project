@java.lang.Override
public void onCreate() {
    super.onCreate();
    buildObjectGraphAndInject();
    if (isDebug()) {
        for (timber.log.Timber.Tree tree : getDebugTrees()) {
            timber.log.Timber.plant(tree);
        }
    }else {
        for (timber.log.Timber.Tree tree : getReleaseTrees()) {
            timber.log.Timber.plant(tree);
        }
    }
}