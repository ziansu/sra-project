@butterknife.OnClick(value = { R.id.empty , R.id.fab_add })
public void startNewServerFlow() {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.page_container, treehou.se.habit.ui.settings.SetupServerFragment.newInstance()).addToBackStack(null).commit();
}