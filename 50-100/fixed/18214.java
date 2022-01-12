@java.lang.Override
public java.util.Set<org.daisy.dotify.api.tasks.TaskGroupInformation> list(java.lang.String locale) {
    java.util.Objects.requireNonNull(locale);
    java.util.Set<org.daisy.dotify.api.tasks.TaskGroupInformation> ret = new java.util.HashSet<>();
    for (org.daisy.dotify.api.tasks.TaskGroupInformation info : listAll()) {
        if (info.matchesLocale(locale)) {
            ret.add(info);
        }
    }
    return ret;
}