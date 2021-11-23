@java.lang.Override
public java.lang.String formatLabel(double value, boolean isValueX) {
    if (isValueX) {
        return months[(((int) (value)) - 1)];
    }else {
        return super.formatLabel(value, isValueX);
    }
}