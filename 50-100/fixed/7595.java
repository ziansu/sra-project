public static java.util.Optional<com.hartwig.healthchecks.boggs.healthcheck.prestasts.PrestatsCheck> getByDescription(@org.jetbrains.annotations.NotNull
final java.lang.String description) {
    java.util.List<com.hartwig.healthchecks.boggs.healthcheck.prestasts.PrestatsCheck> types = java.util.Arrays.asList(com.hartwig.healthchecks.boggs.healthcheck.prestasts.PrestatsCheck.values());
    return types.stream().filter(( t) -> t.description.equalsIgnoreCase(description)).findFirst();
}