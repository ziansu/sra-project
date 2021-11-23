@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    journalChanged = true;
    mServices.deleteJournal(mJournal);
    java.lang.String msg = java.lang.String.format(getString(R.string.msg_deleted), getString(R.string.str_journal));
    com.ndhunju.dailyjournal.util.UtilsView.toast(getActivity(), msg);
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Constants.KEY_JOURNAL_CHGD, true);
    getActivity().setResult(AppCompatActivity.RESULT_OK, intent);
    getActivity().finish();
}