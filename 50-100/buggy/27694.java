@java.lang.Override
public void receiveTaskEndEvent(eu.learnpad.simulator.monitoring.event.impl.TaskEndSimEvent event) {
    for (java.lang.String userId : event.involvedusers) {
        ((eu.learnpad.simulator.uihandler.webserver.UIServlet) (usersMap.get(userId).getServletInstance())).removeTask(event.task.id);
    }
    webserver.removeServletHolder(tasksMap.get(event.task));
    tasksMap.remove(event.task.id);
}