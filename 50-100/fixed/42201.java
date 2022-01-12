@java.lang.Override
protected void executeInternal(org.quartz.JobExecutionContext arg0) throws org.quartz.JobExecutionException {
    active_number = globalService.getNumberByVariable(Global_enum.Event_item_active_ID);
    int event_number = globalService.getNumberByVariable(Global_enum.Event_item_number);
    int number = ((int) (1 + ((java.lang.Math.random()) * event_number)));
    if ((active_number) != 0) {
        event_itemService.passtiveEvent(active_number);
    }
    event_itemService.acitveEvent(number);
    active_number = number;
    globalService.setNumberByVariable(Global_enum.Event_item_active_ID, active_number);
}