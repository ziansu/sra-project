protected static java.util.LinkedList<com.andrew.Ticket> searchByName(java.util.LinkedList<com.andrew.Ticket> ticketQueue, java.lang.String query) {
    java.util.LinkedList<com.andrew.Ticket> searchResults = new java.util.LinkedList<com.andrew.Ticket>();
    for (com.andrew.Ticket ticket : ticketQueue) {
        java.lang.String desc = ticket.getDescription().toLowerCase();
        if (desc.contains(query)) {
            searchResults.add(ticket);
        }
    }
    return searchResults;
}