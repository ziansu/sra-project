private void makeSchoolsRequest() {
    java.util.HashMap<java.lang.String, java.lang.String> queryParams = new java.util.HashMap<>();
    queryParams.put("sort[attr]", "lower(name)");
    queryParams.put("sort[order]", "asc");
    Requests.Schools.with(getActivity()).makeListRequest(queryParams);
}