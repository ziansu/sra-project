@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.allMusic :
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.russell.calmmusic.activities.ListActivity.class);
            startActivity(intent);
            break;
        case R.id.controller :
            android.content.Intent intent1 = new android.content.Intent();
            intent1.setClass(this, com.russell.calmmusic.activities.PlayingActivity.class);
            startActivity(intent1);
            break;
        default :
            break;
    }
}