@org.apache.shiro.authz.annotation.RequiresPermissions(value = "arsenal:stock:update")
@com.bjsts.manager.controller.purchase.RequestMapping(value = "/update", method = RequestMethod.POST)
public java.lang.String update(com.bjsts.manager.form.purchase.StockForm stockForm, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (result.hasErrors()) {
        redirectAttributes.addFlashAttribute(stockForm);
        return "redirect:/stock/update/" + (stockForm.getStock().getId());
    }
    com.bjsts.manager.entity.purchase.StockEntity stock = stockForm.getStock();
    com.bjsts.manager.entity.purchase.StockEntity stockEntity = stockService.get().get(stock.getId());
    stockService.get().update(stockEntity);
    return "result";
}