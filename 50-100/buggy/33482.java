public static com.spinalcraft.manager.server.Application completeApplication(java.lang.String uuid, boolean accept, java.lang.String staffIdentity) {
    try {
        com.spinalcraft.manager.server.component.ApplicationManager.lockTable();
        if (!(com.spinalcraft.manager.server.component.ApplicationManager.applicationNotComplete(uuid)))
            return null;
        
        com.spinalcraft.manager.server.component.ApplicationManager.updateApplication(uuid, accept, staffIdentity);
        com.spinalcraft.manager.server.component.ApplicationManager.unlockTable();
        return com.spinalcraft.manager.server.component.ApplicationManager.getApplication(uuid);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    com.spinalcraft.manager.server.component.ApplicationManager.unlockTable();
    return null;
}