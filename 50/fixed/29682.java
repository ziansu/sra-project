@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    dialogInterface.dismiss();
    mPresenter.saveBoolean(Constants.APP_RATING_SUBMITTED, false);
}