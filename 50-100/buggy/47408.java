private java.lang.String getMemoryCacheKey() {
    return new java.lang.StringBuilder().append("#w").append(minWidth).append("#h").append(minHeight).append("#W").append(maxWidth).append("#H").append(maxHeight).append("#S").append(scaleType.ordinal()).append(url).toString();
}