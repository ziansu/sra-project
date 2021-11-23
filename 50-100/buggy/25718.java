@org.springframework.web.bind.annotation.RequestMapping(value = { "/admin/export" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView writeFile(@org.springframework.web.bind.annotation.ModelAttribute
patrimoine.models.Collection collection, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) throws java.io.IOException, jxl.read.biff.BiffException, jxl.write.WriteException {
    collection.setNom("Pedagogique");
    excelService.writeFileExcelExport(collection.getNom());
    java.util.HashMap<java.lang.String, java.lang.Object> model = new java.util.HashMap<java.lang.String, java.lang.Object>();
    model.put("collection", new patrimoine.models.Collection());
    return new org.springframework.web.servlet.ModelAndView("patrimoine/Import-export", model);
}