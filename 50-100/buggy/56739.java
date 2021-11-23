@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    cursor.moveToPosition(position);
    stopManagingCursor(cursor);
    java.lang.String nameOfDisease = cursor.getString(1);
    android.content.Intent i = new android.content.Intent(this, com.example.vromia.healthadvisor.Activities.DiseaseActivity.class);
    i.putExtra("name", nameOfDisease);
    startActivity(i);
    if (hasAnimations) {
        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }
}