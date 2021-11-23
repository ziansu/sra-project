@java.lang.Override
public boolean onBackPressed() {
    getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    ((ar.rulosoft.mimanganu.MainActivity) (getActivity())).getSupportActionBar().show();
    ((ar.rulosoft.mimanganu.MainActivity) (getActivity())).setColorToBars();
    return false;
}