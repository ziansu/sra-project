@java.lang.Override
public void removeProgressBottomGrid() {
    this.endlessScrollListener.removeProgressItem();
    this.adapter.removeProgress();
}