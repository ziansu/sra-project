public void vote() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.System.out.println("\nPlease select the note you want to vote for (0-7):");
    int vote = scan.nextInt();
    if ((vote <= 7) && (vote > 0)) {
        java.lang.System.out.println("Attempting vote registration.");
        registerVote(vote);
    }else {
        java.lang.System.out.println("Select a note between 0 and 7.");
        vote();
    }
}