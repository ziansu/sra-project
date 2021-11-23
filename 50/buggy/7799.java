private org.json.JSONObject searchPlaces() {
    return new dao.PlaceDAO(this.getParent()).searchPlaceByPartName(getFilter());
}