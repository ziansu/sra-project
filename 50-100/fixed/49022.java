public static void main(java.lang.String[] args) {
    view.CalendarPanel calendarview = new view.CalendarPanel();
    view.EventPanel eventView = new view.EventPanel();
    model.ModelGregorianCalendar mgc = new model.ModelGregorianCalendar(new model.EventCollection(new java.util.ArrayList<model.Event>()));
    mgc.setDate(java.time.LocalDate.now());
    control.ui.CalendarControl calendarControl = new control.ui.CalendarControl(calendarview, mgc);
    view.MainFrame mf = new view.MainFrame(calendarview, eventView);
    mf.initialize();
}