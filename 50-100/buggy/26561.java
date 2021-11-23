@java.lang.Override
public U findById(final java.lang.String id) {
    org.pac4j.core.profile.service.AbstractProfileService.init(null);
    org.pac4j.core.profile.service.AbstractProfileService.assertNotBlank(getIdAttribute(), id);
    final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> listAttributes = read(defineAttributesToRead(), getIdAttribute(), id);
    return convertAttributesToProfile(listAttributes);
}