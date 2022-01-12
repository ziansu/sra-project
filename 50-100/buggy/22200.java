@org.springframework.web.bind.annotation.RequestMapping(path = "/initiative/{initiativeId}/model/cardWrapper/{cardWrapperId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelCardWrapperDto> getCardWrapper(@org.springframework.web.bind.annotation.PathVariable(value = "initiativeId")
java.lang.String initiativeIdStr, @org.springframework.web.bind.annotation.PathVariable(value = "cardWrapperId")
java.lang.String cardWrapperIdStr) {
    java.util.UUID initiativeId = java.util.UUID.fromString(initiativeIdStr);
    if (!(initiativeService.canAccess(initiativeId, getLoggedUserId()))) {
        return new org.collectiveone.common.dto.GetResult<org.collectiveone.modules.model.dto.ModelCardWrapperDto>("error", "access denied", null);
    }
    return modelService.getCardWrapper(java.util.UUID.fromString(cardWrapperIdStr), getLoggedUser().getC1Id());
}