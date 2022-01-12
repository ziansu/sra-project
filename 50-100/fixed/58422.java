protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("In Purchase Servlet");
    dataLoader = request.getParameter("dataLoader");
    jsonFilePath = request.getServletContext().getInitParameter("JsonFilePath");
    java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> resultSetList = new java.util.HashMap<>();
    if (dataLoader.equals("true")) {
        resultSetList = new com.cherp.data.PurchaseDataManager().formDataGenerator();
    }
    jsonFileWriter(resultSetList);
}