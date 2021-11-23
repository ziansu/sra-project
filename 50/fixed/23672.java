@java.lang.Override
public void onClick(android.view.View view) {
    getFragmentManager().beginTransaction().replace(R.id.profileFragment, new com.example.thang.mobile_dating_app_v20.Fragments.EditProfile()).commit();
}