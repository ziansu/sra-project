@org.springframework.web.bind.annotation.RequestMapping(value = "/pipesizeMaster/{pipeSizeId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editPipeSizeMasterData(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
final org.egov.wtms.masters.entity.PipeSize pipeSize, @org.springframework.web.bind.annotation.PathVariable
final long pipeSizeId, final org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttrs, final org.springframework.ui.Model model, final org.springframework.validation.BindingResult resultBinder) {
    if (resultBinder.hasErrors())
        return "pipesize-master";
    
    pipeSizeService.updatePipeSize(pipeSize);
    redirectAttrs.addFlashAttribute("pipeSize", pipeSize);
    return getPipeSizeMasterList(model);
}