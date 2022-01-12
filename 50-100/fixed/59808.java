@org.apache.shiro.authz.annotation.RequiresPermissions(value = "arsenal:saleItem:update")
@com.bjsts.manager.controller.sale.RequestMapping(value = "/update", method = RequestMethod.POST)
public java.lang.String update(com.bjsts.manager.form.sale.SaleItemForm saleItemForm, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (result.hasErrors()) {
        redirectAttributes.addFlashAttribute(saleItemForm);
        return "redirect:/saleItem/update/" + (saleItemForm.getSaleItem().getId());
    }
    com.bjsts.manager.entity.sale.PlanTraceEntity saleItem = saleItemForm.getSaleItem();
    com.bjsts.manager.entity.sale.PlanTraceEntity planTraceEntity = saleItemService.get(saleItem.getId());
    saleItemService.update(planTraceEntity);
    return "result";
}