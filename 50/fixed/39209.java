private void displayPlayerRolesDialog() {
    android.app.FragmentManager fm = getActivity().getFragmentManager();
    com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment dialog = new com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment();
    dialog.setTargetFragment(this, 0);
    dialog.show(fm, "roles");
}