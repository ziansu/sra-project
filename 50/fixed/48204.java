@java.lang.Override
public void load() {
    getLoaderManager().restartLoader(0, null, mLoaderCallbacks);
}