protected void onPostExecute(java.lang.String result) {
    if (result.equals("Empty Input")) {
        android.widget.Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        return ;
    }
    if (result.equals("Translate Error")) {
        android.widget.Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        t1.setText(result);
        return ;
    }
    t1.setText(result);
    return ;
}