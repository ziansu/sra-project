@org.springframework.web.bind.annotation.RequestMapping(value = { "getUsers" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public jtelecom.grid.ListHolder getUsers(@jtelecom.controller.csr.ModelAttribute
jtelecom.grid.GridRequestDto request) {
    java.lang.System.out.println(request.toString());
    java.lang.String sort = request.getSort();
    int start = request.getStartBorder();
    int length = request.getLength();
    java.lang.String search = request.getSearch();
    java.util.List<jtelecom.dao.user.User> data = userDAO.getLimitedQuantityUsers(start, length, sort, search);
    int size = userDAO.getCountUsersWithSearch(search);
    return jtelecom.grid.ListHolder.create(data, size);
}