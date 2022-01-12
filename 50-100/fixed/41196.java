public void addNewRow() {
    com.google.gwt.core.client.Scheduler.get().scheduleDeferred(new com.google.gwt.core.client.Scheduler.ScheduledCommand() {
        public void execute() {
            if (!(commonEditingCheck()))
                ensureEditing();
            
            org.geogebra.web.html5.main.DrawEquationWeb.addNewRowToMatrix(seMayLatex);
        }
    });
}