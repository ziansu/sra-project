@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    launchEditItem(getActivity(), MainActivity.FragmentType.DETAILS_INCOME, ((mahappdev.caresilabs.com.timr.models.IncomeModel) (incomeAdapter.getItem(position))));
}