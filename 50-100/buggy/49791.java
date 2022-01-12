private org.dkpro.tc.api.features.Feature getFeature(java.lang.String bitCode, int i) {
    java.lang.String value = ((bitCode != null) && ((bitCode.length()) >= 16)) ? bitCode.substring(0, i) : de.unidue.ltl.toobee.feature.resource.BrownClusterNormalizedLowerCaseFeature.NOT_SET;
    boolean isDummy = value.equals(de.unidue.ltl.toobee.feature.resource.BrownClusterNormalizedLowerCaseFeature.NOT_SET);
    return new org.dkpro.tc.api.features.Feature(("brown_" + i), value, isDummy);
}