@java.lang.Override
public java.util.List<com.jmb.springfactory.model.dto.RolDto> findByNameContain(java.lang.String name) throws com.jmb.springfactory.exceptions.NotFoundException {
    serviceLog.info(("Searching roles with name equals to " + name));
    final java.util.List<com.jmb.springfactory.model.entity.Rol> foundRoles = rolMongoService.findByNameContain(name).collect(java.util.stream.Collectors.toList());
    throwNotFoundExceptionIfEmptyList(foundRoles);
    serviceLog.info((("Have been found " + (foundRoles.size())) + " roles"));
    serviceLog.info("Transforming Roles to Dtos");
    return this.convertListEntityToListDto(foundRoles);
}