@java.lang.Override
@javax.annotation.Nonnull
public synchronized java.util.List<java.lang.String> getValues() {
    checkForDefaultValues();
    return new java.util.ArrayList<java.lang.String>(axisValues);
}