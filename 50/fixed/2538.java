@java.lang.Override
public void run() {
    if ((com.gcw.sapienza.places.utils.FacebookUtils.getInstance().hasCurrentUserId()) == false) {
        handler.postDelayed(this, Utils.UPDATE_DELAY);
    }else {
        queryParsewithLocation(getLocation());
    }
}