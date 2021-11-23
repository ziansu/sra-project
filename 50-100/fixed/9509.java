private static org.bonitasoft.studio.model.process.Data resolveData(final org.bonitasoft.studio.model.process.Data referencedData) {
    return com.google.common.collect.Iterables.find(org.bonitasoft.studio.common.emf.tools.ModelHelper.getAccessibleData(org.bonitasoft.studio.common.emf.tools.ModelHelper.getParentProcess(referencedData)), new com.google.common.base.Predicate<org.bonitasoft.studio.model.process.Data>() {
        @java.lang.Override
        public boolean apply(final org.bonitasoft.studio.model.process.Data data) {
            return data.getName().equals(referencedData.getName());
        }
    }, null);
}