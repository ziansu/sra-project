@java.lang.Override
public void done(com.parse.ParseObject event, com.parse.ParseException e) {
    if (e == null) {
        java.lang.System.out.println("Unpined");
        event.unpinInBackground("FavoritedEvents");
    }else
        if ((e.getCode()) == (com.parse.ParseException.OBJECT_NOT_FOUND)) {
            java.lang.System.out.println("Pinned");
            mEvent.pinInBackground("FavoritedEvents");
        }else {
            android.util.Log.e(acc.aviato.EventDetailActivity.TAG, e.getMessage());
        }
    
}