@java.lang.Override
public java.util.List<com.jmb.springfactory.model.dto.RolDto> findByNameContain(java.lang.String name) throws com.jmb.springfactory.exceptions.NotFoundException {
    serviceLog.debug(("Searching roles with name equals to " + name));
    final java.util.List<com.jmb.springfactory.model.entity.Rol> foundRoles = rolMongoService.findByNameContain(name).collect(java.util.stream.Collectors.toList());
    throwNotFoundExceptionIfEmptyList(foundRoles);
    serviceLog.debug((("Have been found " + (foundRoles.size())) + " roles"));
    serviceLog.debug("Transforming Roles to Dtos");
    return this.convertListEntityToListDto(foundRoles);
}