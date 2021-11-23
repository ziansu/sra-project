private void validateFamilyName(java.util.List<classes.Family> families) throws java.lang.Exception {
    for (classes.Family fam : families)
        classes.Gedcom.validFamilyName(fam.id);
    
}