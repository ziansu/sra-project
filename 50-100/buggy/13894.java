@java.lang.Override
public U findByLinkedId(final java.lang.String linkedId) {
    org.pac4j.core.profile.service.AbstractProfileService.init(null);
    org.pac4j.core.profile.service.AbstractProfileService.assertNotBlank(org.pac4j.core.profile.service.AbstractProfileService.LINKEDID, linkedId);
    final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> listAttributes = read(defineAttributesToRead(), org.pac4j.core.profile.service.AbstractProfileService.LINKEDID, linkedId);
    return convertAttributesToProfile(listAttributes);
}