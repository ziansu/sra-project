@org.springframework.web.bind.annotation.RequestMapping(value = "/complaintTicket", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String queryMap() throws java.lang.ClassNotFoundException, java.sql.SQLException, org.json.JSONException {
    return queryMap.queryLocation();
}