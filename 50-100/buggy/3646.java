@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_admin);
    edu.gatech.buzzmovieselector.biz.UserManagementFacade um = new edu.gatech.buzzmovieselector.biz.impl.UserManager();
    java.util.List<edu.gatech.buzzmovieselector.entity.User> userList = um.findAll();
    android.util.Log.v("ADMIN ACTIVITY list", userList.toString());
    edu.gatech.buzzmovieselector.controller.util.UserListAdapter adapter = new edu.gatech.buzzmovieselector.controller.util.UserListAdapter(userList, this);
    android.widget.ListView listview = ((android.widget.ListView) (findViewById(R.id.userListView)));
    listview.setAdapter(adapter);
}