private static int partyAssignedOriginal() throws java.util.InputMismatchException {
    int requestedSeats;
    requestedSeats = com.leonselby.test.CinemaExperience.PartyDeclaration.askForPartySize();
    int assignedSeats = 0;
    try {
        if (requestedSeats <= ((com.leonselby.test.CinemaExperience.PartyDeclaration.screen1.getSeats()) - (com.leonselby.test.CinemaExperience.PartyDeclaration.screen1.getCustomers()))) {
            assignedSeats = requestedSeats;
        }else {
            com.leonselby.test.CinemaExperience.PartyDeclaration.handleTooMany();
            assignedSeats = 0;
        }
    } catch (java.util.InputMismatchException ime) {
        requestedSeats = com.leonselby.test.CinemaExperience.PartyDeclaration.askForPartySize();
    }
    return assignedSeats;
}