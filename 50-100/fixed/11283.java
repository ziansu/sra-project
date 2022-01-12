@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null) {
        resetShareFragment();
        android.util.Log.d(com.gcw.sapienza.places.ShareFragment.TAG, e.getMessage());
    }else {
        resetShareFragment();
        ((com.gcw.sapienza.places.com.gcw.sapienza.places.MainActivity) (getActivity())).refresh();
    }
}