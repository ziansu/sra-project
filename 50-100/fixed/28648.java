@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    int totalTasks = ((java.lang.Long) (dataSnapshot.getValue())).intValue();
    edu.uw.dengz6.checkmate.TaskCompletedData mTaskCompletedData = new edu.uw.dengz6.checkmate.TaskCompletedData(userName, totalTasks, createdOn);
    completedTasksList.add(mTaskCompletedData);
    adapter.notifyDataSetChanged();
}