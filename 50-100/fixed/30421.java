@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    journalChanged = true;
    mServices.deleteJournal(mJournal);
    java.lang.String msg = java.lang.String.format(getString(R.string.msg_deleted), getString(R.string.str_journal));
    com.ndhunju.dailyjournal.util.UtilsView.toast(getActivity(), msg);
    getActivity().finish();
}