protected java.util.List<hudson.model.AbstractBuild> filterBuilds(hudson.util.RunList runs) {
    if ((this.result) == null) {
        return runs;
    }
    return runs.filter(new com.google.common.base.Predicate<hudson.model.AbstractBuild>() {
        @java.lang.Override
        public boolean apply(hudson.model.AbstractBuild b) {
            return (b.getResult()) == (result);
        }
    });
}