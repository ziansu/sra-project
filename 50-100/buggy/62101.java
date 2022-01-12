@java.lang.Override
public void loadPhoto(boolean allowed) {
    java.util.Date date = new java.util.Date();
    if (checkForPhoto(date)) {
        android.util.Log.i(br.com.android.rafaelsermenho.nasapod.presenterimpl.MainPresenterImpl.TAG, "No new photo for today, loading previously downloaded");
        if (br.com.android.rafaelsermenho.nasapod.NasaPodApplication.isApplicationVisible()) {
            br.com.android.rafaelsermenho.nasapod.model.Photo photoFromDay = getPhotoFromDay(date);
            fillData(photoFromDay);
            savePhoto(photoFromDay, allowed);
            sendNotification(photoFromDay.getTitle());
        }
    }
    if (key_daily_updates) {
        android.util.Log.i(br.com.android.rafaelsermenho.nasapod.presenterimpl.MainPresenterImpl.TAG, "Scheduling JobService");
        scheduleService();
    }
}