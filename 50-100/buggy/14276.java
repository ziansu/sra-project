@java.lang.Override
protected double computeMaxWidth(double height) {
    if ((getOrientation()) == (javafx.geometry.Orientation.VERTICAL)) {
        return getItems().stream().map(( i) -> i.maxWidth(height)).min(java.util.Comparator.naturalOrder()).get();
    }
    return super.computeMaxWidth(height);
}