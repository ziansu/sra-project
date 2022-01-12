private void getAgeCheckBoxArray(java.util.List<sanguinehaze.charactercreator.domain.dtos.Age> allAges) {
    ageCB = new java.lang.String[allAges.size()];
    for (int ii = 0; ii < (allAges.size()); ii++) {
        ageCB[ii] = allAges.get(ii).getName();
    }
}