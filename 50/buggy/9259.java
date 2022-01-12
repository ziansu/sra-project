@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.duy.pascal.frontend.code_sample.CodeSampleEntry> aVoid) {
    super.onPostExecute(aVoid);
    adapter.addCodes(codeSampleEntries);
    adapter.notifyDataSetChanged();
}