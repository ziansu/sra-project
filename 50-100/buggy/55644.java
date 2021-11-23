@org.springframework.web.bind.annotation.RequestMapping(value = "list")
public org.springframework.web.servlet.ModelAndView listCouriers(com.bos.model.Courier courier) {
    java.lang.String contextPath = request.getContextPath();
    if (courier != null) {
        modelAndView.addObject("courier", courier);
    }
    java.util.List<com.bos.model.Courier> couriers = courierService.listCouriers(courier.getName());
    modelAndView.addObject("couriers", couriers);
    modelAndView.setViewName("layout/courier/list");
    return modelAndView;
}