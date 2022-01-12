@java.lang.Override
public void showAllEntries() {
    try {
        java.util.List<com.model.interfaces.IEntry> entriesList = dbModel.readAll();
        java.util.Collections.sort(entriesList);
        allEntriesView.setDataTable(entriesList);
        calendarView.closeView();
        allEntriesView.showView();
    } catch (java.sql.SQLException | java.lang.ClassNotFoundException ex) {
        messageService.showError(new java.lang.StringBuilder(70).append("\u0421\u043e\u0435\u0434\u0438\u043d\u0435\u043d\u0438\u0435 \u0441 \u0431\u0430\u0437\u043e\u0439 \u0434\u0430\u043d\u043d\u044b\u0445 \u0443\u0442\u0435\u0440\u044f\u043d\u043e\n").append("или некорректная таблица с данными.").toString(), "Ошибка подключения");
        showCalendar();
        calendarView.lockEntriesView();
    }
}