public java.lang.Iterable<T> getBuildsAfter(int n) {
    return filterSkipped((isMyBuilds() ? dynamicBuildRepository.<T>getCurrentUserBuildsGreaterThan(((com.groupon.jenkins.dynamic.build.DbBackedProject) (owner)), n) : dynamicBuildRepository.<T>getBuildGreaterThan(((com.groupon.jenkins.dynamic.build.DbBackedProject) (owner)), n, branch)));
}