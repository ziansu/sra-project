private void pepareData() {
    if ((UA) != null)
        UA.setSource("Australian Department of Foreign Affairs and Trade");
    
    if ((US) != null)
        US.setSource("U.S. Department of State");
    
    if ((CA) != null) {
        CA.setSource("Global Affairs Canada");
        CA.setAdvise(CA.getAdvise().replaceAll("<.*?>", ""));
    }
    prepared = true;
}