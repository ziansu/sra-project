@java.lang.Override
public void updateList(com.pmanager.humbertolinero.pmanager.HelperClasses.route routeOfInterest, enumerations.childOperations operations) {
    if ((this.LVadapter) != null) {
        this.LVadapter.updateListContent(routeOfInterest, operations);
        this.LVadapter.notifyDataSetChanged();
    }
}