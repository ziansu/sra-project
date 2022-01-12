@com.google.inject.Provides
com.github.pockethub.core.gist.GistStore gistStore(org.eclipse.egit.github.core.service.GistService service) {
    com.github.pockethub.core.gist.GistStore store = ((gists) != null) ? gists.get() : null;
    if (store == null) {
        store = new com.github.pockethub.core.gist.GistStore(service);
        gists = new java.lang.ref.WeakReference(store);
    }
    return store;
}