@java.lang.Override
protected java.util.List<java.lang.String> doInBackground(java.lang.Void... params) {
    try {
        java.util.List<java.lang.String> categories = new java.util.ArrayList<java.lang.String>(new net.dean.jraw.managers.AccountManager(me.ccrama.redditslide.Authentication.reddit).getSavedCategories());
        categories.add("New category");
        return categories;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}