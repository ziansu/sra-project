@org.springframework.web.bind.annotation.RequestMapping(value = "/myGroups")
public java.util.Set<com.luxoft.wheretogo.models.json.GroupResponse> myGroups(javax.servlet.http.HttpServletRequest request) {
    com.luxoft.wheretogo.controller.User user = ((com.luxoft.wheretogo.controller.User) (request.getSession().getAttribute("user")));
    user = usersService.initGroups(user);
    return groupsService.getUserRelevantGroupResponses(user);
}