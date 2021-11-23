public void onCancelled() {
    if (getScope().isLoading()) {
        getScope().setLoading(false);
    }
    getScope().setCancelled(true);
}