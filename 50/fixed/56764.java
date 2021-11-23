@org.springframework.web.bind.annotation.RequestMapping(value = { "/upload" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
public java.lang.String upload(@org.springframework.web.bind.annotation.RequestParam(value = "projectId")
java.lang.String projectId, org.springframework.ui.Model model) {
    edu.tamu.ctv.controller.FileUploadController.logger.debug("upload()");
    model.addAttribute("importProjectId", ((java.lang.Object) (projectId)));
    return "fileupload/upload";
}