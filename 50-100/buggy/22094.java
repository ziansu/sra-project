@java.lang.Override
public void run() {
    if ((count) > 0) {
        count -= 50;
        onSlide(count, zeus.minhquan.lifemanager.RecordActivity.TypeSlide.DOWN);
        android.util.Log.d(zeus.minhquan.lifemanager.RecordActivity.TAG, ("FkingCount" + (count)));
    }else {
        ivSave.setImageResource(R.drawable.ic_pre_black_24dp);
        isSave = true;
        timerShow.cancel();
        timerShow.purge();
        ivShowRecord.setImageResource(R.drawable.slide_up);
    }
}