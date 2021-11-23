public static void deleteLast() {
    try {
        de.unibremen.swp.stundenplan.command.CommandHistory.commandHistory.remove(de.unibremen.swp.stundenplan.command.CommandHistory.getLast());
        if ((de.unibremen.swp.stundenplan.command.CommandHistory.commandHistory.size()) > 0)
            if ((de.unibremen.swp.stundenplan.command.CommandHistory.getLast()) instanceof de.unibremen.swp.stundenplan.command.EditCommand)
                de.unibremen.swp.stundenplan.command.CommandHistory.lastIsEditCommand = true;
            
        
    } catch (de.unibremen.swp.stundenplan.exceptions.StundenplanException n) {
        java.lang.System.out.println("[COMMANDHISTORY]: No Command in history yet.");
    }
}