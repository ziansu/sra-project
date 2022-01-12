private org.osate.aadl2.NamedElement getParsedAnnexSubclause(final org.osate.aadl2.AnnexSubclause annexSubclause) {
    if (annexSubclause instanceof org.osate.aadl2.DefaultAnnexSubclause) {
        final org.osate.aadl2.NamedElement parsedSubclause = ((org.osate.aadl2.DefaultAnnexSubclause) (annexSubclause)).getParsedAnnexSubclause();
        if (parsedSubclause instanceof org.osate.aadl2.DefaultAnnexSubclause) {
            return null;
        }
        return parsedSubclause;
    }
    return null;
}