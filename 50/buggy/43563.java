@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    mAdapter = new me.li2.android.fiserv.smartmoney.ui.BankingOperationFragment.BankingOperationAdapter(getActivity(), createItems());
}