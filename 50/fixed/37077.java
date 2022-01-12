@java.lang.Override
protected void refresh() {
    super.refresh();
    if ((enteredGameListTask) != null) {
        enteredGameListTask.cancel(true);
    }
    enteredGameListTask = new net.mabako.steamgifts.fragments.profile.LoadEnteredGameListTask(this, 1);
    enteredGameListTask.execute();
}