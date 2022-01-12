protected android.content.Context getContext() {
    android.content.Context context = null;
    if ((this.weakContext) != null) {
        context = this.weakContext.get();
    }
    return context;
}