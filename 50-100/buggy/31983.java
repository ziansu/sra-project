public static int partyAssignedOriginal(int input) throws java.util.InputMismatchException {
    int requestedSeats;
    requestedSeats = input;
    int assignedSeats = 0;
    try {
        if (requestedSeats <= (((com.leonselby.test.CinemaExperience.PartyDeclaration.screen1.getSeats()) - (com.leonselby.test.CinemaExperience.PartyDeclaration.screen1.getCustomers())) - assignedSeats)) {
            assignedSeats = requestedSeats;
            com.leonselby.test.CinemaExperience.PartyDeclaration.assignedSeating = requestedSeats;
        }else {
            com.leonselby.test.CinemaExperience.PartyDeclaration.handleTooMany();
            assignedSeats = 0;
            com.leonselby.test.CinemaExperience.PartyDeclaration.assignedSeating = 0;
        }
    } catch (java.util.InputMismatchException ime) {
        requestedSeats = com.leonselby.test.CinemaExperience.PartyDeclaration.askForPartySize();
    }
    return assignedSeats;
}