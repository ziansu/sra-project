public void showWindow(org.libreplan.business.planner.entities.Task task, org.libreplan.business.planner.entities.Task task2) {
    calendarAllocationModel.setTask(task);
    calendarCombo = ((org.zkoss.zul.Combobox) (window.getFellow("calendarCombo")));
    fillCalendarComboAndMarkSelected();
    try {
        org.libreplan.web.common.Util.reloadBindings(window);
        window.doModal();
    } catch (org.zkoss.zk.ui.SuspendNotAllowedException e) {
        throw new java.lang.RuntimeException(e);
    }
}