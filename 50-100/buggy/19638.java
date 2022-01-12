public static void Lock(boolean masterTag, javax.smartcardio.CardTerminal terminal) {
    try {
        terminal.waitForCardPresent(0);
        java.lang.String UID = org.mdpnp.smartcardio.rfid.ReadCard.getUID();
        terminal.waitForCardAbsent(2000);
        org.mdpnp.smartcardio.db.EmployeeManager eManager = new org.mdpnp.smartcardio.db.EmployeeManager();
        org.mdpnp.smartcardio.dto.CardDTO myList = eManager.findByUID(UID);
        if ((masterTag == true) || (myList != null))
            org.mdpnp.smartcardio.lock.LockScreen.WindowLock();
        
    } catch (java.lang.Throwable t) {
        java.lang.System.out.println("Bad Read. Try Again.");
    }
}