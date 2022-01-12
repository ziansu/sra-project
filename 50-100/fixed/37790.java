@com.google.inject.Provides
com.github.pockethub.core.gist.GistStore gistStore(android.content.Context context) {
    com.github.pockethub.core.gist.GistStore store = ((gists) != null) ? gists.get() : null;
    if (store == null) {
        store = new com.github.pockethub.core.gist.GistStore(context);
        gists = new java.lang.ref.WeakReference(store);
    }
    return store;
}