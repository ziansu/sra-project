private void pepareData() {
    UA.setSource("Australian Department of Foreign Affairs and Trade");
    US.setSource("U.S. Department of State");
    CA.setSource("Global Affairs Canada");
    CA.setAdvise(CA.getAdvise().replaceAll("<.*?>", ""));
    prepared = true;
}