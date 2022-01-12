@java.lang.Override
public void execute(org.quartz.JobExecutionContext context) throws org.quartz.JobExecutionException {
    java.util.List<com.model.Ticket> lijst = com.persistentie.TicketCSV.getTickets();
    if (((com.database.DataSource.dbStatus) == "ONLINE") && ((lijst.size()) != 0)) {
        com.ehbrail.JobSendPersistentTickets.logger.info("Doorsturen gepersisteerde tickets.");
        java.lang.System.out.println("hier2");
        for (com.model.Ticket t : lijst) {
            if ((com.database.TicketDAO.writeTicket(lijst.get(0))) == true) {
                com.persistentie.TicketCSV.removeFirstTicket();
            }
        }
    }
}