private void setEntry(com.prolificidea.templates.tsw.services.DTOs.EntryDTO entry) {
    entry.setChallengeId(challenge.getChallengeId());
    entry.setDate(new java.util.Date());
    entry.setSolution(new byte[]{ 1 , 123 , 123 , 124 , 34 , 12 });
}