@java.lang.Override
public boolean onSlide(org.spiffyui.client.widgets.slider.SliderEvent e) {
    int max = slider.getValueMax();
    int min = slider.getValueMin();
    setYearInput(min, max);
    filteredSet = new com.uzh.gwt.softeng.shared.FilmDataSet(filmSet.filterByDateRange(new com.google.gwt.view.client.Range(min, (max - min))));
    return true;
}