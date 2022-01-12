public void showAllWorkers() {
    listing.setModel(new org.zkoss.zul.SimpleListModel(workerModel.getAllCurrentWorkers().toArray()));
    listing.invalidate();
}