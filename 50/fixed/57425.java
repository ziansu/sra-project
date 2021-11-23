@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.fml24.fml24.Model.MyNumbers> jsonArrayOfMyNumbers) {
    myNumbersAdaptor = new com.example.fml24.fml24.Adaptor.MyNumbersAdaptor(getActivity(), jsonArrayOfMyNumbers);
    setListAdapter(myNumbersAdaptor);
}