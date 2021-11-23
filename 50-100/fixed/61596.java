@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(mContext, com.walmartlabs.classwork.rideone.activities.RideDetailActivity.class);
    ride.getDriver().flush();
    i.putExtra("ride", ride.flush());
    mContext.startActivity(i);
}