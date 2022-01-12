@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(mContext, com.walmartlabs.classwork.rideone.activities.RideDetailActivity.class);
    i.putExtra("ride", ride.flush());
    i.putExtra("driver", ride.getDriver().flush());
    mContext.startActivity(i);
}