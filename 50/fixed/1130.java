@java.lang.Override
public java.lang.String[] getLocations() throws java.io.IOException, java.lang.InterruptedException {
    return (wrappedInputSplit) != null ? wrappedInputSplit.getLocations() : new java.lang.String[0];
}