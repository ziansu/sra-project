@java.lang.Override
public void clearAnswer() {
    for (int i = 0; i < (mItems.size()); ++i) {
        selected[i] = false;
        imageViews[i].setBackgroundColor(Color.WHITE);
    }
}