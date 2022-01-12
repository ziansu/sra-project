private org.dkpro.tc.api.features.Feature getFeature(java.lang.String bitCode, int i) {
    if ((bitCode == null) || (bitCode.isEmpty())) {
        return new org.dkpro.tc.api.features.Feature(("brown_" + i), de.unidue.ltl.toobee.feature.resource.BrownClusterNormalizedLowerCaseFeature.NOT_SET, true);
    }
    java.lang.String value = ((bitCode.length()) >= i) ? bitCode.substring(0, i) : de.unidue.ltl.toobee.feature.resource.BrownClusterNormalizedLowerCaseFeature.NOT_SET;
    return new org.dkpro.tc.api.features.Feature(("brown_" + i), value, value.equals(de.unidue.ltl.toobee.feature.resource.BrownClusterNormalizedLowerCaseFeature.NOT_SET));
}