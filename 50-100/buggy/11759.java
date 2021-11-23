@java.lang.Override
public boolean removeBusiness(java.lang.String id) throws java.lang.Exception {
    com.foodie.app.Helper.DebugHelper.Log(("removeBusiness: id = " + id));
    BusinessRef.child(id).removeValue();
    localDB.removeBusiness(id);
    java.util.List<com.foodie.app.entities.Activity> businessActivities = com.foodie.app.database.Converters.cursorToActivityList(localDB.getActivity(new java.lang.String[]{ com.foodie.app.entities.Activity.ACTIVITY_BUSINESS_ID }, new java.lang.String[]{ id }));
    for (com.foodie.app.entities.Activity ac : businessActivities) {
        removeActivity(ac.get_ID());
    }
    return true;
}