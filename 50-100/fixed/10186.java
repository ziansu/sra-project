public void resetItems() {
    if ((swipeListView.getAdapter()) != null) {
        int count = swipeListView.getAdapter().getCount();
        int size = opened.size();
        for (int i = size; i < count; i++) {
            opened.add(false);
            openedRight.add(false);
            checked.add(false);
        }
    }
}