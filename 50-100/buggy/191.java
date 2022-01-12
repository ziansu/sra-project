protected void onPostExecute(java.lang.Boolean result) {
    if (!(is_setup)) {
        android.widget.TextView head = ((android.widget.TextView) (findViewById(R.id.question_setting_header)));
        head.setText((((head.getText()) + ": ") + (curSetting)));
    }
}