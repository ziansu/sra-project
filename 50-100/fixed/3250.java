@org.springframework.web.bind.annotation.RequestMapping(value = "/buy")
@org.springframework.web.bind.annotation.ResponseBody
public com.netease.course.utils.Status buy(@org.springframework.web.bind.annotation.RequestBody
java.util.List<com.netease.course.meta.BuyList> buyList, javax.servlet.http.HttpSession session) {
    trx.buy(buyList);
    com.netease.course.meta.User user = ((com.netease.course.meta.User) (session.getAttribute("user")));
    com.netease.course.meta.User newUser = userDao.getUser(user.getUserName());
    session.setAttribute("user", newUser);
    return com.netease.course.utils.Status.OK;
}