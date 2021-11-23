public void printAllTickets() {
    for (com.packt.ticketMachine.tickets.Ticket ticket : ticketsList) {
        java.lang.System.out.format("%s %n", ticket.getName());
    }
    java.lang.System.out.println("Proszę odebrać bilety");
}