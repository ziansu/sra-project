@org.springframework.web.bind.annotation.RequestMapping(path = "/initiative/{initiativeId}/model/view/{viewId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelViewDto> getView(@org.springframework.web.bind.annotation.PathVariable(value = "initiativeId")
java.lang.String initiativeIdStr, @org.springframework.web.bind.annotation.PathVariable(value = "viewId")
java.lang.String viewIdStr, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "1")
java.lang.Integer level) {
    java.util.UUID initiativeId = java.util.UUID.fromString(initiativeIdStr);
    if (!(initiativeService.canAccess(initiativeId, getLoggedUserId()))) {
        return new org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelViewDto>("error", "access denied", null);
    }
    return modelService.getView(java.util.UUID.fromString(viewIdStr), getLoggedUser().getC1Id(), level);
}