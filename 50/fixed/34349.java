private void checkIntent() {
    int action = getIntent().getIntExtra("action", (-1));
    if (action == (es.usc.citius.servando.calendula.activities.CalendarActivity.ACTION_SHOW_REMINDERS)) {
    }
}