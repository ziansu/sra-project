@java.lang.Override
public void run() {
    curList.addAll(com.breadwallet.tools.sqlite.CurrencyDataSource.getInstance(getContext()).getAllISOs());
    final android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(getContext(), R.layout.bread_spinner_item, curList);
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            spinner.setAdapter(adapter);
        }
    });
}