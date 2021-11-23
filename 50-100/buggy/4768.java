@ga.doblue.project.controller.PostMapping
org.springframework.http.ResponseEntity<?> create(@ga.doblue.project.controller.RequestBody
ga.doblue.project.model.Project project) throws java.lang.Exception {
    ga.doblue.project.help.AjaxResult ajaxResult = new ga.doblue.project.help.AjaxResult();
    try {
        service.insert(project);
        ajaxResult.setResult("SUCS");
    } catch (java.lang.Exception e) {
        ajaxResult.setResult("FAIL");
    }
    return new org.springframework.http.ResponseEntity<ga.doblue.project.help.AjaxResult>(ajaxResult, org.springframework.http.HttpStatus.OK);
}