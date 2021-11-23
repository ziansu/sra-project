public static org.talend.designer.components.hashfile.common.MATCHING_MODE parse(java.lang.String matchingMode) {
    org.talend.designer.components.hashfile.common.MATCHING_MODE[] multipleMatchingModes = org.talend.designer.components.hashfile.common.MATCHING_MODE.values();
    for (org.talend.designer.components.hashfile.common.MATCHING_MODE multipleMatchingMode : multipleMatchingModes) {
        if (multipleMatchingMode.toString().equals(matchingMode)) {
            return multipleMatchingMode;
        }
    }
    return null;
}