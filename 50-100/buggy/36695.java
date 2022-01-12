@java.lang.Override
public void onClick(android.view.View v) {
    item.setName(Name.getText().toString());
    item.setDate(new org.joda.time.LocalDateTime(sYear, ((sMonth) + 1), sDay, sHour, sMinute));
    item.setNote(Note.getText().toString());
    db.updateItem(item);
    teamspoiler.renameme.ItemNotification.notify(this, item);
    finish();
}