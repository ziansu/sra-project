@java.lang.Override
public void removeSolver() {
    try {
        sessionContext.removeAttribute(SessionAttribute.CourseTimetablingSolver);
        sessionContext.removeAttribute("Suggestions.model");
        org.unitime.timetable.solver.SolverProxy solver = getSolverNoSessionCheck();
        if (solver != null) {
            solver.interrupt();
            solver.dispose();
        }
        sessionContext.removeAttribute(SessionAttribute.CourseTimetablingUser);
    } catch (java.lang.Exception e) {
        org.unitime.timetable.solver.service.CourseTimetablingSolverService.sLog.warn(("Failed to remove a solver: " + (e.getMessage())), e);
    }
}