@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString("leadId", leadId);
    outState.putString("selCategory", selCategory);
    outState.putString("selSubCategory", selSubCategory);
    outState.putStringArrayList("selIdProofList", selIdProofList);
    outState.putStringArrayList("selResidProofList", selResidProofList);
    outState.putStringArrayList("selIncomeProofList", selIncomeProofList);
    outState.putSerializable(Utils.KEY_LEAD_DATA, leadInfoModel);
    outState.putSerializable(Utils.KEY_BI_DATA, biDashboardModel);
    outState.putStringArrayList("listQues", listQues);
}