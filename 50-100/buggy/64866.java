@javax.annotation.Nullable
public static org.atlasapi.media.entity.ReviewType fromKey(java.lang.String key) {
    return java.util.Arrays.stream(org.atlasapi.media.entity.ReviewType.values()).filter(( reviewType) -> key.equalsIgnoreCase(reviewType.name())).findFirst().orElse(null);
}