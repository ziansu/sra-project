private void getAmenityList(javax.servlet.http.HttpServletRequest request, java.io.PrintWriter out) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    controller.AmenityDAO dao = new controller.AmenityDAO();
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (controller.Amenity amenity : dao.findAll()) {
        list.add(amenity.getName());
    }
    request.setAttribute("amenityList", list);
    out.print(gson.toJson(list));
    out.flush();
}