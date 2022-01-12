@org.springframework.web.bind.annotation.RequestMapping(path = "/create", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.context.request.async.DeferredResult createTemplate(@org.springframework.web.bind.annotation.RequestBody
com.smartjournal.dto.TemplateDTO templateDTO) {
    org.springframework.web.context.request.async.DeferredResult deferredResult = new org.springframework.web.context.request.async.DeferredResult();
    com.smartjournal.model.Template template = new com.smartjournal.model.Template();
    template.setTemplateName(templateDTO.getTemplateName());
    template.setLayer(templateDTO.getLayer());
    template = templateRepository.save(template);
    deferredResult.setResult(new org.springframework.http.ResponseEntity(template, org.springframework.http.HttpStatus.OK));
    return deferredResult;
}