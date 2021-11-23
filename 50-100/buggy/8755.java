@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent1 = new android.content.Intent(activity, ir.rasen.charsoo.view.activity.business.ActivityBusinessFollowers.class);
    intent1.putExtra(Params.BUSINESS_ID_STRING, business.id);
    intent1.putExtra(Params.USER_ID_INT, ir.rasen.charsoo.controller.helper.LoginInfo.getUserId(activity));
    intent1.putExtra(Params.BUSINESS_OWNER, business.userID);
    activity.startActivity(intent1);
}