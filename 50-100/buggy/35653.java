private java.lang.String readablePoolsString() {
    java.lang.String pools = "resourcePools:\n";
    for (java.util.Map.Entry entry : serverConfiguration.getResourcePools().entrySet()) {
        pools += ((("        " + (entry.getKey())) + ": ") + (entry.getValue())) + "\n";
    }
    return pools;
}