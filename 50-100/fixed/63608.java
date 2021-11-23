@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            startActivity(new android.content.Intent(getApplicationContext(), kr.edcan.neologism.activity.DicMenuActivity.class));
            break;
        default :
            android.widget.Toast.makeText(this, "업데이트 후 적용될 예정입니다!", Toast.LENGTH_SHORT).show();
    }
}