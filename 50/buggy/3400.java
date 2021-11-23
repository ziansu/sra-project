public java.lang.String execute() throws java.lang.Exception {
    eventManager = new org.hibernate.tutorial.EventManager();
    events = eventManager.listEvents();
    return SUCCESS;
}