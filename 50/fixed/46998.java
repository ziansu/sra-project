@org.springframework.web.bind.annotation.RequestMapping(path = "editDrink.do")
public java.lang.String editDrink(com.sd.happy.data.Drink drink, javax.servlet.http.HttpSession session) {
    dao.editDrink(drink);
    session.setAttribute("drink", drink);
    return "results";
}