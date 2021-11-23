@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean edited = com.infiniteloop.mytasks.data.TaskLab.get(getActivity()).editTask(mTask, getActivity());
    if (edited) {
        android.content.Intent resultIntent = new android.content.Intent();
        getActivity().setResult(Activity.RESULT_OK, resultIntent);
        getActivity().finish();
    }
}