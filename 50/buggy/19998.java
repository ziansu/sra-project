public boolean remove_Service(int service_id) {
    java.sql.ResultSet rs;
    rs = dbc.send_Command((("delete from service where id=" + (java.lang.Integer.toString(service_id))) + "')"));
    return rs == null;
}