@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent();
    switch (v.getId()) {
        case R.id.allMusic :
            intent.setClass(this, com.russell.calmmusic.activities.ListActivity.class);
            startActivity(intent);
            break;
        case R.id.discCtrl :
            intent.setClass(this, com.russell.calmmusic.activities.PlayingActivity.class);
            startActivity(intent);
            break;
        default :
            break;
    }
}