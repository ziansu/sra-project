@java.lang.Override
public void onFinishEraseDialog() {
    mPresenter.clearData().doOnSubscribe(() -> mEraseInProgress = true).doOnCompleted(() -> mEraseInProgress = false).subscribe();
}