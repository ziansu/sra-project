@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_add_position :
            android.content.Intent intent = new android.content.Intent(this, com.example.logan.test2.AddPositionActivity.class);
            intent.putExtra("Team", team);
            startActivityForResult(intent, com.example.logan.test2.ListPositionsActivity.REQUEST_CODE_ADD_POSITION);
            break;
        default :
            break;
    }
}