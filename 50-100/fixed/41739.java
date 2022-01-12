@org.springframework.web.bind.annotation.RequestMapping(value = { "/admin/import" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView readFile(@org.springframework.web.bind.annotation.RequestParam(value = "file")
org.springframework.web.multipart.MultipartFile file, @org.springframework.web.bind.annotation.ModelAttribute
patrimoine.models.Collection collection, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) throws java.io.IOException, jxl.read.biff.BiffException {
    storageService.store(file);
    excelService.loadFileExcelCollectionImport(file.getOriginalFilename());
    excelService.readFileExcelCollectionImport(collection.getNom());
    java.util.HashMap<java.lang.String, java.lang.Object> model = new java.util.HashMap<java.lang.String, java.lang.Object>();
    model.put("collection", new patrimoine.models.Collection());
    return new org.springframework.web.servlet.ModelAndView("patrimoine/Import-export", model);
}