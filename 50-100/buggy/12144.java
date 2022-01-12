private static java.lang.String[] getParams(final java.util.Map<java.lang.String, java.lang.String> valueNameParamsMap) {
    return valueNameParamsMap.entrySet().stream().map(it.unibo.alchemist.boundary.gui.TestSingleApplicationBuilder::getParam).collect(java.util.stream.Collectors.toList()).toArray(new java.lang.String[]{  });
}