@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    boolean flag = true;
    for (int mem : edu.aku.hassannaqvi.dss_census.core.MainApp.memClicked) {
        if (mem == position) {
            flag = false;
            break;
        }
    }
    if (flag) {
        (edu.aku.hassannaqvi.dss_census.core.MainApp.memFlag)++;
        MainApp.memClicked.add(position);
        android.content.Intent i = new android.content.Intent(getApplicationContext(), edu.aku.hassannaqvi.dss_census.activities.SectionBActivity.class);
        i.putExtra("dataFlag", true);
        i.putExtra("position", position);
        startActivity(i);
    }
}