@org.springframework.web.bind.annotation.RequestMapping(path = "editDrink.do")
public java.lang.String editDrink(com.sd.happy.data.Drink drink, javax.servlet.http.HttpSession session) {
    java.lang.System.out.println(drink.getName());
    java.lang.System.out.println(drink.getId());
    dao.editDrink(drink);
    session.setAttribute("drink", drink);
    return "results";
}