@org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String readProperty(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id, org.springframework.ui.ModelMap model) {
    com.vinodseb.springmvca.service.MultiFileBucket filesModel = new com.vinodseb.springmvca.service.MultiFileBucket();
    com.vinodseb.springmvca.entities.Property property = em.find(com.vinodseb.springmvca.entities.Property.class, id);
    if (property != null) {
        filesModel.setPropertyId(property.getId());
    }else {
        property = new com.vinodseb.springmvca.entities.Property();
    }
    model.addAttribute("multiFileBucket", filesModel);
    model.addAttribute("property", property);
    return "sell/sell";
}