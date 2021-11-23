public void invalidateIndices() {
    for (int i = 0; i < (this.getChildCount()); i++) {
        ambious.androidtroper.MainActivity.InternalWebViewClient iwvc = null;
        if ((this.getWebView(i)) != null)
            iwvc = ((ambious.androidtroper.MainActivity.InternalWebViewClient) (this.getWebView(i).getWebViewClient()));
        
        if (iwvc != null)
            iwvc.changeID(i);
        
    }
}