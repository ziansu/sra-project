public static boolean memberIsUnwrapped(com.fasterxml.jackson.databind.introspect.AnnotatedMember member) {
    if (member == null) {
        return false;
    }
    return com.google.common.base.Optional.fromNullable(member.getAnnotation(com.fasterxml.jackson.annotation.JsonUnwrapped.class)).isPresent();
}