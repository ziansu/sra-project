@java.lang.Override
public void run() {
    prepareData();
    listAdapter = new com.example.mitsichury.firstwebservicegetinformation.ExpandableListAdapter(getApplicationContext(), listData);
    expLv.setAdapter(listAdapter);
    imgV.setVisibility(View.GONE);
    progressBar.setVisibility(View.GONE);
}