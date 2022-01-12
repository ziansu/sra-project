public void onCancelled() {
    if ((getScope()) != null) {
        if (getScope().isLoading()) {
            getScope().setLoading(false);
        }
        getScope().setCancelled(true);
    }
}