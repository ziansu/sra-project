@java.lang.Override
public void onItemClick(android.widget.AdapterView parent, android.view.View view, int position, long id) {
    java.lang.System.out.println("click");
    cs48.project.com.parl.models.User selectedUser = ((cs48.project.com.parl.models.User) (parent.getItemAtPosition(position)));
    cs48.project.com.parl.ui.activities.ChatActivity.startActivity(getActivity(), selectedUser.userName, selectedUser.uid, selectedUser.firebaseToken, selectedUser.language);
}