public void onResult(boolean success) {
    if (onRestart) {
        java.lang.System.out.println("onRestartResult");
        adapter.refreshData(buildMap());
        adapter.notifyDataSetChanged();
    }else {
        setupTabs(buildMap());
        onRestart = false;
    }
}