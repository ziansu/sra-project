@java.lang.Override
public lv.javaguru.java2.servlet.mvc.MVCModel processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.util.List<lv.javaguru.java2.domain.Value> countries = new java.util.ArrayList<lv.javaguru.java2.domain.Value>();
    lv.javaguru.java2.database.jdbc.ValueDAOImpl valueDAO = new lv.javaguru.java2.database.jdbc.ValueDAOImpl();
    try {
        countries = valueDAO.getLovByType("Country");
    } catch (lv.javaguru.java2.database.DBException e) {
        e.printStackTrace();
    }
    return new lv.javaguru.java2.servlet.mvc.MVCModel("/jsp/companyregpage.jsp", countries);
}