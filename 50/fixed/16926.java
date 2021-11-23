public void addTickets(java.lang.String type, int maxUses, int number, boolean validationCode) {
    for (int i = 0; i < number; i++) {
        addTicket(type, maxUses, validationCode);
    }
}