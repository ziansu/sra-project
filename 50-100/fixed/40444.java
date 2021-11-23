public java.util.ArrayList<ifs_devices.model.Request> GetRequest() {
    java.lang.System.out.println("Inside the model");
    java.util.ArrayList<ifs_devices.model.Request> req = null;
    try {
        java.sql.Connection connection = ifs_devices.model.Database.Get_Connection();
        req = ifs_devices.model.Query.getRequest(connection);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("erro" + e));
    }
    return req;
}