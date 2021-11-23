@java.lang.Override
public void initView(org.unicef.rapidreg.childcase.CaseRegisterAdapter adapter) {
    caseRegisterAdapter = adapter;
    android.support.v7.widget.RecyclerView.LayoutManager layout = new android.support.v7.widget.LinearLayoutManager(getContext());
    layout.setAutoMeasureEnabled(true);
    fieldList.setLayoutManager(layout);
    caseRegisterAdapter.setCasePhotoAdapter(casePhotoAdapter);
    caseRegisterAdapter.setItemValues(itemValues);
    fieldList.setAdapter(caseRegisterAdapter);
}