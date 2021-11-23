private void setContentView() {
    if (overviewProvider.hasEntries()) {
        setContentView(R.layout.main);
    }else {
        setContentView(R.layout.noentriesoverview);
    }
}