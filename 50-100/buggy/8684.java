@org.springframework.web.bind.annotation.RequestMapping(path = "/initiative/{initiativeId}/model/section/{sectionId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelSectionDto> getSection(@org.springframework.web.bind.annotation.PathVariable(value = "initiativeId")
java.lang.String initiativeIdStr, @org.springframework.web.bind.annotation.PathVariable(value = "sectionId")
java.lang.String sectionIdStr, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "1")
java.lang.Integer level) {
    java.util.UUID initiativeId = java.util.UUID.fromString(initiativeIdStr);
    if (!(initiativeService.canAccess(initiativeId, getLoggedUserId()))) {
        return new org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelSectionDto>("error", "access denied", null);
    }
    return modelService.getSection(java.util.UUID.fromString(sectionIdStr), getLoggedUser().getC1Id(), level);
}