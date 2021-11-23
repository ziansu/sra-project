@java.lang.Override
public void sortDataPoints() {
    if (!(dataPointsDirty)) {
        return ;
    }
    super.sortDataPoints();
    dataPointsDirty = false;
    scalesDirty = true;
}