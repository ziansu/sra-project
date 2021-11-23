@net.petrovsky.flights.web.RequestMapping(value = "/order", method = RequestMethod.GET)
public java.lang.String makeAnOrder(@net.petrovsky.flights.web.RequestParam(value = "flight_id")
java.lang.String flightId, @net.petrovsky.flights.web.ModelAttribute(value = "ordersIndex")
java.util.Set indexSet, @net.petrovsky.flights.web.ModelAttribute(value = "user")
net.petrovsky.flights.model.User user, org.springframework.ui.Model model) {
    if (!(indexSet.contains(java.lang.Integer.valueOf(flightId)))) {
        orderService.save(new net.petrovsky.flights.model.Order(null, user, flightService.getByID(java.lang.Integer.valueOf(flightId))));
        indexSet.add(java.lang.Integer.valueOf(flightId));
        model.addAttribute("ordersIndex", indexSet);
    }else {
        model.addAttribute("msgExistentOrder", "You have ordered already this flight");
    }
    return "forward:/";
}