@org.springframework.web.bind.annotation.RequestMapping(value = "/")
java.lang.String index(org.springframework.ui.Model model) {
    java.util.List<wow.roll.domain.ItemLootView> loots = itemLootService.getPageItemLootView(0);
    model.addAttribute("loots", loots);
    return "index";
}