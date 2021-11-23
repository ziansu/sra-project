@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (mDriverButton.getId())) {
        android.content.Intent driverIntent = new android.content.Intent(this, com.tsevans.dddispatcher.Controllers.Activities.DriverActivities.DriverSetupActivity.class);
        startActivity(driverIntent);
    }else
        if ((view.getId()) == (mRiderButton.getId())) {
            android.content.Intent riderIntent = new android.content.Intent(this, com.tsevans.dddispatcher.Controllers.Activities.RiderActivities.RiderSetupActivity.class);
            startActivity(riderIntent);
        }
    
}