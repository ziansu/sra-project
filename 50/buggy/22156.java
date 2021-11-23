@java.lang.Override
public void doAction(org.zkoss.ganttz.extensions.IContextWithPlannerTask<org.libreplan.business.planner.entities.TaskElement> context, org.libreplan.business.planner.entities.TaskElement task) {
    if (isApplicableTo(task)) {
        this.calendarAllocationController.showWindow(((org.libreplan.business.planner.entities.Task) (task)), context.getTask());
    }
}