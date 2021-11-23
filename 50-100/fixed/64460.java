@com.smartjournal.controller.RequestMapping(path = "/create", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity createTemplate(@com.smartjournal.controller.RequestBody
com.smartjournal.dto.TemplateDTO templateDTO) {
    com.smartjournal.model.Template template = new com.smartjournal.model.Template();
    template.setTemplateName(templateDTO.getTemplateName());
    template.setLayer(templateDTO.getLayer());
    template = templateRepository.save(template);
    return new org.springframework.http.ResponseEntity(template, org.springframework.http.HttpStatus.OK);
}