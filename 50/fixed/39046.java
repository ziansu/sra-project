private void performDumpOnFileKey(java.lang.String filename_key) {
    java.util.ArrayList<java.lang.String> output = getBasicOutput(filename_key);
    writeBasicOutput(output);
    output = getOutputWithLength(filename_key);
    writeOutputWithLength(output);
}