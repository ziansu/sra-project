@org.springframework.web.bind.annotation.RequestMapping(value = "/workType/newWorkType", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addType(@org.springframework.validation.annotation.Validated
@org.springframework.web.bind.annotation.ModelAttribute(value = "workType")
com.oblenergo.model.WorkType workType, org.springframework.validation.BindingResult bindingResult) {
    java.util.List<com.oblenergo.DTO.WorkTypeDTO> allWorkTypes = sapServiceImpl.getAllWorkTypes();
    for (com.oblenergo.DTO.WorkTypeDTO list : allWorkTypes) {
        if (workType.getId().equals(list.getId())) {
            workType.setName(list.getName());
            break;
        }
    }
    workType.setEnabled(true);
    workTypeServiceImpl.save(workType);
    return "redirect:/admin";
}