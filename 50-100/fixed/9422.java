@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    edu.uw.dengz6.checkmate.TaskAllFragment.tasks.clear();
    if ((dataSnapshot.getValue()) != null) {
        for (com.google.firebase.database.DataSnapshot taskSnapshot : dataSnapshot.getChildren()) {
            edu.uw.dengz6.checkmate.TaskData task = taskSnapshot.getValue(edu.uw.dengz6.checkmate.TaskData.class);
            if (!(task.isCompleted)) {
                edu.uw.dengz6.checkmate.TaskAllFragment.tasks.add(task);
            }
        }
    }
    adapter.notifyDataSetChanged();
    progressDialog.dismiss();
}