public static <T extends com.appspot.gardemallorie.domain.Persistable> void setSelection(android.widget.Spinner spinner, T selection) {
    if (selection == null) {
        spinner.setSelection(0);
    }else {
        spinner.setSelection(((android.widget.ArrayAdapter) (spinner.getAdapter())).getPosition(selection));
    }
}