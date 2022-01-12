public static void main(java.lang.String[] args) {
    com.valuados.tickets.main.Schedule schedule = new com.valuados.tickets.main.Schedule();
    com.valuados.tickets.main.BookingList bookingList = new com.valuados.tickets.main.BookingList();
    com.valuados.tickets.main.App.readFile(com.valuados.tickets.main.App.INPUTFILENAME, schedule, bookingList);
    java.lang.System.out.println("Welcome to Ticket Booking System");
    java.lang.System.out.println("To see all commands type help");
    while (true) {
        com.valuados.tickets.main.App.doCommand(schedule, bookingList);
    } 
}