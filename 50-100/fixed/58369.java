@java.lang.Override
public boolean onLongClick(android.view.View v) {
    java.util.HashMap<java.lang.String, java.lang.Boolean> columnExists = com.pioneer.aaron.dolly.fork.DataBaseOpearator.getInstance(this).getColumnsExists();
    if (((columnExists.get(ForkCallLogData.SUBJECT)) && (columnExists.get(ForkCallLogData.POST_CALL_TEXT))) && (columnExists.get(ForkCallLogData.IS_PRIMARY))) {
        mPresenter.forkRCS(this);
    }
    return false;
}