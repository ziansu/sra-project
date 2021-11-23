@java.lang.Override
public void onChange(org.spiffyui.client.widgets.slider.SliderEvent e) {
    int max = slider.getValueMax();
    int min = slider.getValueMin();
    setYearInput(min, max);
    filteredSet = new com.uzh.gwt.softeng.shared.FilmDataSet(filmSet.filterByDateRange(new com.google.gwt.view.client.Range(min, max)));
    fillDataTable();
    draw();
}