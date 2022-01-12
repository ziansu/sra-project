@java.lang.Override
protected void onPostExecute(com.senacor.devconfapp.Event event) {
    android.widget.TextView eventIdText = ((android.widget.TextView) (findViewById(R.id.id_value)));
    android.widget.TextView eventNameText = ((android.widget.TextView) (findViewById(R.id.name_value)));
    java.lang.System.out.println(event.getId());
    eventIdText.setText(event.getId());
    eventNameText.setText(event.getName());
}