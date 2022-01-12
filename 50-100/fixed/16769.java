@java.lang.Override
public void pauseActivity() {
    android.util.Log.d(tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.TAG, "in pauseActivity");
    if ((tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powerListListener) != null) {
        tomi.piipposoft.blankspellbook.Utils.DataSource.removePowerListListener(tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powerListListener);
        tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powerListListener = null;
    }
    if ((tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.dailyPowerListListener) != null) {
        tomi.piipposoft.blankspellbook.Utils.DataSource.removeDailyPowerListListener(tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.dailyPowerListListener);
        tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.dailyPowerListListener = null;
    }
    if ((tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powersListener) != null) {
        tomi.piipposoft.blankspellbook.Utils.DataSource.removePowersListener(tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powersListener);
        tomi.piipposoft.blankspellbook.MainActivity.MainActivityPresenter.powersListener = null;
    }
}