@org.springframework.web.bind.annotation.RequestMapping(value = "/restaurant/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addRestaurant(@org.springframework.web.bind.annotation.ModelAttribute
eu.epitech.serverandroid.beans.Restaurant params) {
    java.lang.System.out.println("test");
    eu.epitech.serverandroid.dao.RestaurantDao dao = new eu.epitech.serverandroid.dao.RestaurantDao();
    return dao.addRestaurant(new eu.epitech.serverandroid.beans.Params());
}