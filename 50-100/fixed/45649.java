@org.springframework.web.bind.annotation.RequestMapping(value = "/showFilter")
public java.lang.String list(org.springframework.ui.Model model, java.lang.Integer offset, java.lang.Integer maxResults) {
    model.addAttribute("house", houseService.list(offset, maxResults));
    model.addAttribute("count", houseService.count());
    model.addAttribute("offset", offset);
    model.addAttribute("url", "showFilter");
    return "filter";
}