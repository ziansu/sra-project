public void run() {
    java.util.List<io.github.apfelcreme.SupportTickets.Bukkit.Ticket.Ticket> tickets = io.github.apfelcreme.SupportTickets.Bukkit.SupportTickets.getDatabaseController().getTickets(Ticket.TicketStatus.OPEN, Ticket.TicketStatus.ASSIGNED, Ticket.TicketStatus.REOPENED);
    java.lang.Integer anz = tickets.size();
    if (anz > 0) {
        if (anz == 1) {
            io.github.apfelcreme.SupportTickets.Bukkit.SupportTickets.sendTeamMessage(io.github.apfelcreme.SupportTickets.Bukkit.SupportTicketsConfig.getText("info.reminderTask.infoSingular"));
        }else {
            io.github.apfelcreme.SupportTickets.Bukkit.SupportTickets.sendTeamMessage(io.github.apfelcreme.SupportTickets.Bukkit.SupportTicketsConfig.getText("info.reminderTask.infoPlural").replace("{0}", anz.toString()));
        }
    }
}