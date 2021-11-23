public boolean isVistor() {
    if ((bundle.getString("isVistor")) != null) {
        java.lang.String vistor = bundle.getString("isVistor");
        android.util.Log.e(TAG, (vistor + " is vistor ?? "));
        if (vistor.toString().equals("Y")) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}