private void saveNewPlan() throws java.io.IOException, java.lang.ClassNotFoundException {
    java.lang.Object inObject = in.readObject();
    if ((inObject == null) || (!(inObject instanceof Shared.Tasks.IPlan))) {
        out.writeObject(ConnState.COMMAND_ERROR);
        return ;
    }
    Shared.Tasks.IPlan plan = ((Shared.Tasks.IPlan) (inObject));
    synchronized(ServerApp.ConnectionManager.TASKSLOCK) {
        plan = ServerMain.tasksDatabaseManager.insertNewPlan(plan);
    }
    this.writeResult((plan != null));
}