private void updateActivity(android.content.Intent i) {
    if (i.hasExtra(InternalBroadcasts.KEY_ACTIVITY_UPDATE)) {
        fi.aalto.trafficsense.trafficsense.ui.ActivityData a = i.getParcelableExtra(InternalBroadcasts.KEY_ACTIVITY_UPDATE);
        fi.aalto.trafficsense.trafficsense.ui.ActivityType topActivity = a.getFirst().Type;
        if (((mMarker) != null) && (topActivity != (latestActivityType))) {
            android.graphics.Bitmap bitmap = fi.aalto.trafficsense.trafficsense.ui.MainActivity.getBitmap(mContext, fi.aalto.trafficsense.trafficsense.ui.ActivityType.getActivityIcon(latestActivityType));
            mMarker.setIcon(fi.aalto.trafficsense.trafficsense.ui.BitmapDescriptorFactory.fromBitmap(bitmap));
            latestActivityType = topActivity;
        }
    }
}