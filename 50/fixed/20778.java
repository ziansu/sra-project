public void resetCount(long count_id) {
    com.knirirr.beecount.widgets.CountingWidget widget = getCountFromId(count_id);
    widget.resetZero();
}