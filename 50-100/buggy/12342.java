@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/processingPages")
public java.lang.String processingPage(org.springframework.ui.Model model, int pageNumber) {
    ecommerce.rmall.domain.Page<ecommerce.rmall.domain.Order> page = this.service.queryProcessingWithPage(0);
    java.util.List<ecommerce.rmall.domain.Station> stations = this.stationService.listAll();
    model.addAttribute("CURRENT", "PROCESSING");
    model.addAttribute("page", page);
    model.addAttribute("stations", stations);
    return "Order/processingPagination";
}