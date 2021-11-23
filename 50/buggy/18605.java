@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPluginManager = org.cobaltians.cobalt.plugin.CobaltPluginManager.getInstance(mContext);
    setRetainInstance(true);
    mAllowCommit = true;
}