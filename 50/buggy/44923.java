@com.oqs.controllers.RequestMapping(value = "/organizations-sort-by", method = RequestMethod.GET)
@com.oqs.controllers.ResponseBody
public java.util.List<com.oqs.model.User> organizationsBySort(@com.oqs.controllers.RequestParam(value = "typeId")
java.lang.String typeId) {
    java.util.List<com.oqs.model.User> organizationList = userDAO.getBsnListByType(typeId);
    java.lang.System.out.println(organizationList.get(0).getType().getName());
    return organizationList;
}