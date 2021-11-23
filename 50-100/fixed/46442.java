@java.lang.Override
public void handleResponse(java.util.List<in.projectmanas.manasliaison.backendless_classes.UserTable> response) {
    if ((response.size()) <= 0)
        userTable = new in.projectmanas.manasliaison.backendless_classes.UserTable();
    else
        userTable = response.get(0);
    
    progressBar.setVisibility(View.GONE);
    rlInterviewSchedule.setVisibility(View.VISIBLE);
    tvSchedule.setText(schedule);
    setListeners();
    checkData();
}