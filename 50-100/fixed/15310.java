@org.springframework.web.bind.annotation.RequestMapping(value = "/avaliableHotels", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView avaliableByCityAndDate(@org.springframework.web.bind.annotation.RequestParam
java.lang.String city, @org.springframework.web.bind.annotation.RequestParam
java.lang.String date, org.springframework.ui.ModelMap model) throws java.text.ParseException {
    java.util.Date utilDate = null;
    java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
    utilDate = dateFormatter.parse(date);
    model.addAttribute("date", date);
    model.addAttribute("list", hotelService.findFree(city, utilDate));
    return new org.springframework.web.servlet.ModelAndView("avaliableHotels", model);
}