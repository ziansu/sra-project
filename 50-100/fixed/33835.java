@java.lang.Override
public void onOtherButtonClick(com.baoyz.actionsheet.ActionSheet actionSheet, int index) {
    switch (index) {
        case 0 :
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), jp.co.efusion.aninstantreply.HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            break;
        case 1 :
            android.content.Intent i = new android.content.Intent(this, jp.co.efusion.aninstantreply.HomeActivity.class);
            i.putExtra("check", true);
            checkSetting = true;
            startActivity(i);
            break;
        default :
            break;
    }
}