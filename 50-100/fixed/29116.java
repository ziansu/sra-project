@org.springframework.web.bind.annotation.RequestMapping(value = "/manage/createResource", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String createResource(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute(value = "resource")
@javax.validation.Valid
final hu.bme.simonyi.dave.resourcemanager.model.Resource resource, org.springframework.validation.BindingResult bindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    model.addAttribute("resource", resource);
    return new hu.bme.simonyi.dave.resourcemanager.web.FormHandler(bindingResult, redirectAttributes, "Resource created", "resource", resource, "manage") {
        @java.lang.Override
        public void processFormData() throws java.lang.Exception {
            resourceRepository.save(resource);
        }
    }.processForm();
}