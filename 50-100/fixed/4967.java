@java.lang.Override
public void onPageSelected(int position) {
    fullFormSwipeLayout.setScrollChild(adapter.getPage(position).getView().findViewById(R.id.register_forms_content));
    org.unicef.rapidreg.childcase.CaseRegisterFragment currentPage = ((org.unicef.rapidreg.childcase.CaseRegisterFragment) (adapter.getPage(position)));
    itemValues = currentPage.getItemValues();
    fullFormAdapter = currentPage.getCaseRegisterAdapter();
    fullFormAdapter.setItemValues(itemValues);
    fullFormAdapter.setCasePhotoAdapter(casePhotoAdapter);
}