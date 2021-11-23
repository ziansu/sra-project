private void GetData() {
    android.util.Log.d("TAG", "GetData() was called");
    Model.instance.getData(new com.example.ruslan.towncare.Models.MasterInterface.GetAllCasesCallback() {
        @java.lang.Override
        public void onComplete(java.util.List<com.example.ruslan.towncare.Models.Case.Case> list) {
            android.util.Log.d("TAG", ("data loaded from Sql DB -> " + (list.size())));
            caseListData = list;
            adapter.notifyDataSetChanged();
        }

        @java.lang.Override
        public void onCancel() {
        }
    });
}