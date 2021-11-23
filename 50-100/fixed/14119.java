@java.lang.Override
public void addNewComment(nikita.model.noark5.v4.interfaces.entities.INikitaEntity entity, nikita.model.noark5.v4.hateoas.IHateoasNoarkObject hateoasNoarkObject) {
    hateoasNoarkObject.addLink(entity, new nikita.model.noark5.v4.hateoas.Link((((((((((contextPath) + (HATEOAS_API_PATH)) + (SLASH)) + (NOARK_FONDS_STRUCTURE_PATH)) + (SLASH)) + (BASIC_RECORD)) + (SLASH)) + (NEW_COMMENT)) + (SLASH)), REL_FONDS_STRUCTURE_NEW_COMMENT, false));
}