@java.lang.Override
public boolean isLegalOutputValue(double value) {
    if ((value < 0) || (value > (numClasses))) {
        return false;
    }
    return wekimini.util.Util.isInteger(value);
}