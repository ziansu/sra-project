public static org.verapdf.as.ASAtom getASAtom(java.lang.String value) {
    if (value == null) {
        return null;
    }
    if (org.verapdf.as.ASAtom.predefinedPDFNames.containsKey(value)) {
        return org.verapdf.as.ASAtom.predefinedPDFNames.get(value);
    }else
        if (org.verapdf.as.ASAtom.cachedPDFNames.containsKey(value)) {
            return org.verapdf.as.ASAtom.cachedPDFNames.get(value);
        }else {
            org.verapdf.as.ASAtom result = new org.verapdf.as.ASAtom(value, false);
            org.verapdf.as.ASAtom.cachedPDFNames.put(value, result);
            return result;
        }
    
}