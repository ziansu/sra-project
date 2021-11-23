@java.lang.Override
public ve.com.gem.resources.ChargeResource toResource(ve.com.gem.entities.Charge object) {
    ve.com.gem.resources.ChargeResource resource = createResourceWithId(object.getId(), object);
    resource.setName(object.getName());
    resource.setDescription(object.getDescription());
    resource.setIsActive(object.getIsActive());
    resource.setIds(object.getId());
    return resource;
}