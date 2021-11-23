@java.lang.Override
public com.ofds.entity.Activity fromDTOToEntity(com.ofds.util.person.dto.ActivityDTO activityDTO, com.ofds.entity.Activity activity) {
    return getMapperFactory().getMapperFacade().map(com.ofds.util.person.dto.ActivityDTO.class, com.ofds.entity.Activity.class);
}