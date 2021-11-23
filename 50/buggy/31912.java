@java.lang.Override
public void onRefresh() {
    mPage = 1;
    mMainPresenter.loadGanks(com.sky.gankmm.ui.main.MainActivity.SIZE, mPage);
}