public void updateHighlight(android.view.View view) {
    initHighlight();
    highlightView.put(view, true);
    for (int i = 0; i < (highlightView.size()); i++) {
        if (highlightView.get(viewList.get(i))) {
            viewList.get(i).setBackgroundResource(android.R.color.holo_blue_light);
        }else {
            viewList.get(i).setBackgroundResource(android.R.color.transparent);
        }
    }
}