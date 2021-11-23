@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    mKey.setText(responseString.replaceAll("\\s+", ""), TextView.BufferType.EDITABLE);
}