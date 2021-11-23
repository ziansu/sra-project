@java.lang.Override
public java.util.ArrayList<com.anonyxhappie.dwarf.pms2.apis.MovieModel> loadInBackground() {
    java.lang.String stringUrl = args.getString(com.anonyxhappie.dwarf.pms2.MainActivity.BUNDLE_URL_KEY);
    android.util.Log.v(com.anonyxhappie.dwarf.pms2.MainActivity.class.getSimpleName(), ("bundle:::" + stringUrl));
    if ((stringUrl == null) | (android.text.TextUtils.isEmpty(stringUrl))) {
        return null;
    }
    try {
        return com.anonyxhappie.dwarf.pms2.network.Utils.extractDataFromJSON(com.anonyxhappie.dwarf.pms2.network.Utils.makeHttpRequest(com.anonyxhappie.dwarf.pms2.network.Utils.generateUrl(stringUrl)));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}