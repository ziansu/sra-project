private void addFragmentToStack(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.real_tab_content, fragment, com.hyl.myschool.activity.school.SchoolListFragment.class.getSimpleName());
    ft.addToBackStack(com.hyl.myschool.activity.school.SchoolListFragment.class.getSimpleName());
    ft.commit();
}