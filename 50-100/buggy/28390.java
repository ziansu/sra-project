@edu.tamu.framework.aspect.annotation.ApiMapping(value = "/reset")
@edu.tamu.framework.aspect.annotation.ApiValidation(business = { @ApiValidation.Business(value = edu.tamu.framework.enums.BusinessValidationType.RESET) })
public edu.tamu.framework.model.ApiResponse resetSetting(@edu.tamu.framework.aspect.annotation.ApiValidatedModel
org.tdl.vireo.model.Configuration configuration) {
    logger.info(((("Resetting configuration with name " + (configuration.getName())) + " and value ") + (configuration.getValue())));
    configuration = configurationRepo.reset(configuration);
    simpMessagingTemplate.convertAndSend("/channel/settings/configurable", new edu.tamu.framework.model.ApiResponse(edu.tamu.framework.enums.ApiResponseType.SUCCESS, configurationRepo.findAll()));
    return new edu.tamu.framework.model.ApiResponse(edu.tamu.framework.enums.ApiResponseType.SUCCESS, configuration);
}