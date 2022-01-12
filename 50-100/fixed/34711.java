@org.springframework.web.bind.annotation.RequestMapping(value = "/dashboard/order/create", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showOrderAddingPage(org.springframework.ui.Model m) {
    m.addAttribute("order", new lannisters.devcor.entity.Order());
    m.addAttribute("problemTypes", problemTypesService.getAllProblemTypes());
    m.addAttribute("rooms", roomsService.getAllRooms());
    m.addAttribute("urgencyStatuses", urgencyStatusesService.getAllUrgencyStatuses());
    return "createOrder";
}