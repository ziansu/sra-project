@java.lang.Override
protected void onResume() {
    super.onResume();
    presenter.setList();
    pl.edu.pwr.zpi.autoasystent.presenters.TransferPresenter.saveFile(this, false, "lel.csv");
    pl.edu.pwr.zpi.autoasystent.presenters.TransferPresenter.saveFile(this, true, "lel.csv");
}