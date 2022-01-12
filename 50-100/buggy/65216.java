public void invalidateIndices() {
    for (int i = 0; i < (this.getChildCount()); i++) {
        ambious.androidtroper.MainActivity.InternalWebViewClient iwvc = ((ambious.androidtroper.MainActivity.InternalWebViewClient) (this.getWebView(i).getWebViewClient()));
        iwvc.changeID(i);
    }
}