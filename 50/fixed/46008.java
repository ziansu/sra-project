@java.lang.Override
public int getPrimaryAxis() {
    if ((content) != null) {
        return content.getPrimaryAxis();
    }
    return Constants.UNKNOWN_AXIS;
}