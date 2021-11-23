@org.springframework.web.bind.annotation.RequestMapping(value = "/stock/target/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processAddForm(@javax.validation.Valid
com.norstc.asb.stock.StockEntity stockEntity, org.springframework.validation.BindingResult result, java.security.Principal principal) {
    if (result.hasErrors()) {
        log.info(("processAdd error: " + (result.toString())));
        return com.norstc.asb.controller.StockController.VIEWS_TARGET_ADD_OR_UPDATE_FORM;
    }else {
        this.stockService.add(stockEntity);
        log.info(("processAdd ok: , stockEntity is: " + (stockEntity.getStockCode())));
        return "redirect:" + (stockEntity.getId());
        return "redirect:/stock/target/" + (stockEntity.getId());
    }
}