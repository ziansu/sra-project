@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            startActivity(new android.content.Intent(this, com.rohitsuratekar.NCBSinfo.common.lecturehalls.LectureHalls.class));
            break;
        case 1 :
            android.widget.Toast.makeText(this, "Coming soon", Toast.LENGTH_SHORT).show();
            break;
        case 2 :
            startActivity(new android.content.Intent(this, com.rohitsuratekar.NCBSinfo.online.temp.camp.CAMP.class));
            break;
    }
}