private void truckData(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    com.deloitte.classes.datamodel.Truck truck = new com.deloitte.classes.datamodel.Truck();
    setTruckData(truck, request.getPathInfo().substring(1));
    com.google.gson.GsonBuilder builder = new com.google.gson.GsonBuilder();
    com.google.gson.Gson gson = builder.create();
    response.getWriter().println(gson.toJson(truck));
}