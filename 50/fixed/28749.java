@java.lang.Override
public void onClick(android.view.View view) {
    crossfade(findViewById(R.id.content_add_date_id), findViewById(R.id.content_main_id), getResources().getInteger(android.R.integer.config_mediumAnimTime));
}