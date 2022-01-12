@org.springframework.web.bind.annotation.RequestMapping(value = "/searchInventoryHistoryList", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String searchInventoryHistoryList(@org.springframework.web.bind.annotation.ModelAttribute(value = "inventoryHistoryForm")
@org.springframework.validation.annotation.Validated
com.JJ.controller.inventorymanagement.InventoryHistorySearchCriteria searchCriteria, org.springframework.validation.BindingResult result, org.springframework.ui.Model model, final org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    com.JJ.controller.inventorymanagement.InventoryHistoryManagementController.logger.debug("searching inventory history list");
    if (result.hasErrors()) {
        return "listInventoryHistory";
    }else {
        productInventoryList = inventoryProductManagementService.searchProductInventory(searchCriteria);
        searchBefore = true;
        model.addAttribute("inventoryHistoryForm", searchCriteria);
        model.addAttribute("modeList", modeList);
        model.addAttribute("locationList", locationList);
        return "listInventoryHistory";
    }
}