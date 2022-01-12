private org.json.JSONArray getRequestData(java.lang.String username) {
    return new com.example.celien.drivemycar.http.JsonParser().getRequestData(username, Constants.GET_REQUEST_DATA);
}