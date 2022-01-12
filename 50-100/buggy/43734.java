protected void onPostExecute(java.lang.String result) {
    if ((result.equals("Empty Input")) || (result.equals("Translate Error"))) {
        android.widget.Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        return ;
    }
    t1.setText(result);
    return ;
}