@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((savedInstanceState != null) && (!(defaults))) {
        if (savedInstanceState.getBoolean(rs.ftn.pma.tourismobile.fragments.BOTTOM_BAR_SHOWING)) {
            bottomBar.show();
        }else {
            bottomBar.hide();
        }
        firstTimeLoading = savedInstanceState.getBoolean(rs.ftn.pma.tourismobile.fragments.FIRST_TIME_LOADING);
    }
}