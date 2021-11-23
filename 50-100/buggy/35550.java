@org.nrg.xapi.rest.XapiRequestMapping(value = { "/commands/{id}" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@io.swagger.annotations.ApiOperation(value = "Update a Command")
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.Void> updateCommand(@org.springframework.web.bind.annotation.RequestBody
final org.nrg.containers.model.command.auto.Command command, @org.springframework.web.bind.annotation.PathVariable
final long id) throws org.nrg.containers.exceptions.BadRequestException, org.nrg.containers.exceptions.CommandValidationException, org.nrg.containers.exceptions.UnauthorizedException, org.nrg.framework.exceptions.NotFoundException {
    checkAdminOrThrow();
    try {
        commandService.throwExceptionIfCommandExists(command);
    } catch (org.nrg.framework.exceptions.NrgRuntimeException e) {
        throw new org.nrg.containers.exceptions.BadRequestException(e);
    }
    commandService.update(((command.id()) == id ? command : command.toBuilder().id(id).build()));
    return org.springframework.http.ResponseEntity.ok().build();
}