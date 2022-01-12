public void addLog(com.uosipa.globalsdb.model.User user, com.uosipa.globalsdb.model.Log log) {
    com.uosipa.globalsdb.database.Database.addToNode(log.getMessage(), user.getLogin(), log.getService().toString(), log.getSeverity().toString(), log.getDate().getTime());
}