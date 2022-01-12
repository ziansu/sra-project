public void initialize() {
    edu.carleton.expensetracker.model.Record wrapper = new edu.carleton.expensetracker.model.Record();
    transactions = wrapper.deserializeRecord();
    day.setSelected(true);
    if (!(initialized)) {
        listViewInit();
        lineChartViewInit();
        PieChartViewInit();
        initialized = true;
    }
    listView();
}