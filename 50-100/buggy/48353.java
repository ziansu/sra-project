@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String target = request.getParameter("target");
    switch (target) {
        case "addNewVehicle" :
            addNewVehicle(request, response);
            break;
        case "getAllVehicles" :
            getAllVehicles(request, response);
            break;
        case "deleteVehicle" :
            deleteVehicle(request, response);
            break;
        case "getFreeVehicles" :
            getFreeVehicles(request, response);
        default :
            break;
    }
}