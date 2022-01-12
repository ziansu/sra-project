public void addParticipants() {
    while (scanner.hasNextLine()) {
        java.lang.System.out.println("Enter Participants followed by enter. When done, type done");
        java.lang.String name = scanner.nextLine().toLowerCase();
        java.lang.String bidder = new java.lang.String(name);
        participants.add(bidder);
        if (name.equals("done")) {
            startBidding();
        }
    } 
}