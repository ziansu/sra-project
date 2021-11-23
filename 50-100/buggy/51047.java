public static void deleteLast() {
    try {
        if ((de.unibremen.swp.stundenplan.command.CommandHistory.getLast()) instanceof de.unibremen.swp.stundenplan.command.EditCommand)
            de.unibremen.swp.stundenplan.command.CommandHistory.lastIsEditCommand = true;
        
        de.unibremen.swp.stundenplan.command.CommandHistory.commandHistory.remove(de.unibremen.swp.stundenplan.command.CommandHistory.getLast());
    } catch (de.unibremen.swp.stundenplan.exceptions.StundenplanException n) {
        java.lang.System.out.println("[COMMANDHISTORY]: No Command in history yet.");
    }
}