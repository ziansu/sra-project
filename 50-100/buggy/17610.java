@java.lang.Override
public int getDimensionPixelSize(int index, int defValue) {
    try {
        return getDimension(index);
    } catch (java.lang.RuntimeException e) {
        java.lang.String s = getString(index);
        if (s != null) {
            com.android.layoutlib.bridge.Bridge.getLog().warning(LayoutLog.TAG_RESOURCES_FORMAT, java.lang.String.format("\"%1$s\" in attribute \"%2$s\" is not a valid format.", s, mNames[index]), null);
        }
        return defValue;
    }
}