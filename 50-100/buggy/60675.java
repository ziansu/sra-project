@java.lang.Override
public void onItemClick(int position) {
    com.waqkz.campusrecruitmentsystem.AccountListFlow.UserList userList = companyArrayList.get(position);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.waqkz.campusrecruitmentsystem.AccountDetailFlow.AccountDetailActivity.class);
    intent.putExtra("memberType", AccountListActivity.membershipType);
    intent.putExtra("user_info", users);
    startActivity(intent);
}