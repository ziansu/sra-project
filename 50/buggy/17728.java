@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View viewClicked, int position, long id) {
    edu.kit.pse.client.goapp.datamodels.User clickedUser = users.get(position);
    java.lang.String message = clickedUser.getName();
    edu.kit.pse.client.goapp.activity.GroupMemberActivity.start(this);
}