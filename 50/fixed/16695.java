@java.lang.Override
public boolean isColdFusionTag(java.lang.String tagName) {
    boolean isColdFusion = tagName.toLowerCase().startsWith("cf");
    return isColdFusion;
}