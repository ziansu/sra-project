@java.lang.Override
public void onPostExecute(java.lang.String[] result) {
    if (result != null) {
        textView.setText(result[0]);
    }
}