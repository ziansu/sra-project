@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(context, com.example.sid.marwadishaadi.User_Profile.UserProfileActivity.class);
    i.putExtra("cust", reverseModelList.get(position).getCustomerNo());
    i.putExtra("from", "reverseMatching");
    i.putExtra("customerNo", rev.getCustomerID());
    context.startActivity(i);
}