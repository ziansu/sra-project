@java.lang.Override
public void onClick(android.view.View v) {
    com.example.pravallika.multiplealarms.beans.SpecialDaysReminder currentSpecialDaysReminder = extractCurrentSplReminder();
    if (null == currentSpecialDaysReminder) {
        return ;
    }
    saveSplRemToDB(currentSpecialDaysReminder);
    setNotificationForReminder(currentSpecialDaysReminder);
    finish();
}