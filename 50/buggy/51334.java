@java.lang.Override
public int getItemCount() {
    edu.aku.hassannaqvi.dss_census.core.MainApp.currentStatusCount = familyMembersList.size();
    return familyMembersList.size();
}