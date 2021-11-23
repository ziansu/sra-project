@org.apache.shiro.authz.annotation.RequiresPermissions(value = "arsenal:stock:create")
@com.bjsts.manager.controller.purchase.RequestMapping(value = "/create", method = RequestMethod.POST)
public java.lang.String create(com.bjsts.manager.form.purchase.StockForm stockForm, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (result.hasErrors()) {
        redirectAttributes.addFlashAttribute(stockForm);
        return "redirect:/stock/create";
    }
    com.bjsts.manager.entity.purchase.StockEntity stockEntity = stockForm.getStock();
    stockService.save(stockEntity);
    return "result";
}