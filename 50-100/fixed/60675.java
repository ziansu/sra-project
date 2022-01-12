@java.lang.Override
public void onItemClick(int position) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.waqkz.campusrecruitmentsystem.AccountDetailFlow.AccountDetailActivity.class);
    intent.putExtra("memberType", AccountListActivity.membershipType);
    intent.putExtra("user_info", companyArrayList.get(position));
    startActivity(intent);
}