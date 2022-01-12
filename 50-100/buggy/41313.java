@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent;
    switch (view.getId()) {
        case R.id.left_menu_setting :
            intent = new android.content.Intent(getActivity(), com.gzfgeh.set.Setting.class);
            getActivity().startActivity(intent);
            break;
        case R.id.personal_set :
            intent = new android.content.Intent(getActivity(), com.gzfgeh.set.PersonalInfo.class);
            startActivityForResult(intent, com.gzfgeh.personalnote.LeftMenu.REQUEST_CODE);
        default :
            break;
    }
}