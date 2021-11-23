public void resetItems() {
    if ((swipeListView.getAdapter()) != null) {
        int count = swipeListView.getAdapter().getCount();
        for (int i = opened.size(); i <= count; i++) {
            opened.add(false);
            openedRight.add(false);
            checked.add(false);
        }
    }
}