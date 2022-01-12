@java.lang.Override
public void done(com.parse.ParseObject event, com.parse.ParseException e) {
    if (e == null) {
        event.unpinInBackground("FavoritedEvents");
    }else
        if ((e.getCode()) == (com.parse.ParseException.OBJECT_NOT_FOUND)) {
            mEvent.pinInBackground("FavoritedEvents");
        }else {
            android.util.Log.e(acc.aviato.EventDetailActivity.TAG, e.getMessage());
        }
    
}