private void setYearAdapters() {
    java.util.List<java.lang.String> years = new java.util.ArrayList<>();
    for (com.onelio.connectu.Containers.AcademicYear year : app.academicYears) {
        years.add(year.getYear());
    }
    yearAdapter = new android.widget.ArrayAdapter(getContext(), R.layout.view_dialog_select, years);
}