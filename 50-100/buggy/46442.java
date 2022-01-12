@java.lang.Override
public void handleResponse(java.util.List<in.projectmanas.manasliaison.backendless_classes.UserTable> response) {
    progressBar.setVisibility(View.GONE);
    rlInterviewSchedule.setVisibility(View.VISIBLE);
    userTable = response.get(0);
    tvSchedule.setText(schedule);
    setListeners();
    checkData();
}