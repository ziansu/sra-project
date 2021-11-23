@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    cursor.moveToPosition(position);
    int idOfEsubstance = java.lang.Integer.parseInt(cursor.getString(0));
    android.content.Intent i = new android.content.Intent(this, com.example.vromia.healthadvisor.Activities.ESubstanceActivity.class);
    i.putExtra("id", idOfEsubstance);
    startActivity(i);
    if (hasAnimations) {
        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }
}