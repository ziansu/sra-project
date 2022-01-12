@org.springframework.web.bind.annotation.RequestMapping(value = "/update/{code}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateSubCategory(@org.springframework.web.bind.annotation.ModelAttribute
@javax.validation.Valid
org.egov.tl.entity.LicenseSubCategory licenseSubCategory, org.springframework.validation.BindingResult errors, org.springframework.web.servlet.mvc.support.RedirectAttributes additionalAttr, final org.springframework.ui.Model model) {
    if (errors.hasErrors()) {
        populateDropdownData(model);
        return "subcategory-update";
    }
    licenseSubCategoryService.updateLicenseSubCategory(licenseSubCategory);
    additionalAttr.addFlashAttribute("message", "msg.success.subcategory.update");
    return "redirect:/licensesubcategory/view/" + (licenseSubCategory.getCode());
}