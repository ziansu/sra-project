@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String home(org.springframework.ui.Model model, java.lang.String category) {
    java.util.List<com.theironyard.Purchase> pli;
    if (category != null) {
        pli = ECSpurchasesDB.findByCategory(category);
    }else {
        pli = ((java.util.List<com.theironyard.Purchase>) (ECSpurchasesDB.findAll()));
    }
    model.addAttribute("purchases", pli);
    model.addAttribute("category", category);
    return "home";
}