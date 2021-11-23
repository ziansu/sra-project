public static void decreaseTimeOneHour() throws java.lang.Exception {
    if ((com.packt.ticketMachine.tickets.TicketsContainer.timeOneHour) > 1) {
        (com.packt.ticketMachine.tickets.TicketsContainer.timeOneHour)--;
    }else {
        throw new java.lang.Exception("Niestety brakuje");
    }
}