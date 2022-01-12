private void findItemById(java.lang.String id) {
    ru.napadovskiu.tracker.Item findItem = this.tracker.findItemById(id);
    if (findItem != null) {
        this.showItem(findItem);
    }
}