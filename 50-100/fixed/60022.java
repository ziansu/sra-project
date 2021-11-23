protected java.lang.Boolean doInBackground(java.lang.String... args) {
    org.json.JSONArray places = at.tugraz.thedrunksailor.DatabaseInterface.searchPlace(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
    if ((places.length()) == 0) {
        return false;
    }else {
        LastVisitedPlace_Fragment.place_list = places;
        return true;
    }
}