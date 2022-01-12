public void handleEvent(com.custardgames.sudokil.events.entities.commands.EntityCommandEvent event) {
    if (isRunning()) {
        if (((event.getEntityName()) != null) && (event.getEntityName().equals(entityName))) {
            triggered = true;
        }
    }
}