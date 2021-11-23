@com.softserve.if072.mvcapp.controller.GetMapping
public java.lang.String getHistories(org.springframework.ui.Model model) {
    java.util.List<com.softserve.if072.common.model.History> histories = historyService.getByUserId();
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(histories)) {
        model.addAttribute("categories", productPageService.getAllCategories(userService.getCurrentUser().getId()));
        model.addAttribute("histories", histories);
        model.addAttribute("historySearchDTO", new com.softserve.if072.common.model.dto.HistorySearchDTO());
        model.addAttribute("historiesSession", pdfCreatorService.getHistoriesByUserId());
        return "history";
    }
    return "emptyHistory";
}