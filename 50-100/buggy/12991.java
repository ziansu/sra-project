protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String action = request.getParameter("action");
    if ((action != null) && (action.equals("list"))) {
        com.tsystems.javaschool.timber.logiweb.service.TruckService truckService = new com.tsystems.javaschool.timber.logiweb.service.TruckService(new com.tsystems.javaschool.timber.logiweb.dao.TruckDao());
        java.util.List<com.tsystems.javaschool.timber.logiweb.entity.Truck> trucks = truckService.findAll();
        request.setAttribute("trucks", trucks);
        javax.servlet.RequestDispatcher rd = getServletContext().getRequestDispatcher("/trucks.jsp");
        rd.forward(request, response);
    }
}