private java.lang.String readablePoolsString() {
    java.lang.StringBuilder pools = new java.lang.StringBuilder("resourcePools:\n");
    for (java.util.Map.Entry entry : serverConfiguration.getResourcePools().entrySet()) {
        pools.append((((("        " + (entry.getKey())) + ": ") + (entry.getValue())) + "\n"));
    }
    return pools.toString();
}