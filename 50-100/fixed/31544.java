@java.lang.Override
public lv.javaguru.java2.servlet.mvc.MVCModel processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    java.util.List<lv.javaguru.java2.domain.Vehicle> vehicleList = new java.util.ArrayList<lv.javaguru.java2.domain.Vehicle>();
    try {
        vehicleList = vehicleDAO.getAll();
    } catch (lv.javaguru.java2.database.DBException e) {
        e.printStackTrace();
    }
    lv.javaguru.java2.domain.Vehicle vehicleTest = vehicleList.get(1);
    lv.javaguru.java2.servlet.mvc.MVCModel model = new lv.javaguru.java2.servlet.mvc.MVCModel("/jsp/getallvehicles.jsp", vehicleTest);
    return model;
}