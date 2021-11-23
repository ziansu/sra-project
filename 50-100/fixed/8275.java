public void show(android.app.Activity activity, chi_software.citybase.ui.dialog.SearchDialog.GetSpinnerListener getSpinnerListener, chi_software.citybase.data.menuSearch.MenuSearch menuSearch, java.util.List<java.lang.String> mTypeSelected, java.util.List<java.lang.String> mAreaSelected, java.util.List<java.lang.String> mPunktSelected) {
    this.mTypeSelected = mTypeSelected;
    this.mPunktSelected = mPunktSelected;
    this.mAreaSelected = mAreaSelected;
    getListener(getSpinnerListener, menuSearch);
    show(activity.getFragmentManager(), "Поиск");
}