@org.springframework.web.bind.annotation.RequestMapping(value = "/manage/material/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String save(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "savMaterial")
library.domain.Material material, org.springframework.validation.BindingResult bindingResult, @org.springframework.web.bind.annotation.RequestParam(value = "materialType", required = true)
int materialType) {
    java.lang.System.out.println(java.lang.String.format("Processing user create form=%s, bindingResult=%s", material, bindingResult));
    if (bindingResult.hasErrors()) {
        return "manage/material";
    }
    try {
        material.setCategory(materialType);
        materialService.saveMaterial(material);
    } catch (org.springframework.dao.DataIntegrityViolationException e) {
        LOGGER.warn("Exception occurred when trying to save the material, assuming duplicate material", e);
        bindingResult.reject("material.exist", "Material already exists");
        return "manage/material";
    }
    return "redirect:/manage/material";
}