@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.infiniteloop.mytasks.data.TaskLab.get(getActivity()).setComplete(task);
    getLoaderManager().restartLoader(0, null, this);
    android.widget.Toast.makeText(getActivity(), ((('"' + (task.getTitle())) + '"') + (getString(R.string.complete_dialog_toast))), Toast.LENGTH_SHORT).show();
}