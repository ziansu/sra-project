@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.tvCensusForms :
            android.content.Intent categoryIntent = new android.content.Intent(this, com.example.knbs.censusapp.CategoryActivity.class);
            startActivity(categoryIntent);
            break;
        case R.id.tvEnumID :
            android.content.Intent enumeratorID = new android.content.Intent(this, com.example.knbs.censusapp.EnumeratorIDActivity.class);
            startActivity(enumeratorID);
            break;
        case R.id.tvTaskList :
            android.content.Intent taskList = new android.content.Intent(this, com.example.knbs.censusapp.TaskLIstActivity.class);
            startActivity(taskList);
            break;
        default :
            android.util.Log.i("DEFAULT ONCLICK OPT", "This is default switch mode");
            break;
    }
}