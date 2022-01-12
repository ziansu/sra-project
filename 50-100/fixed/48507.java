private static java.util.Map<io.crate.sql.tree.QualifiedName, io.crate.analyze.relations.AnalyzedRelation> mapSourceRelations(io.crate.analyze.relations.MultiSourceSelect multiSourceSelect) {
    return com.google.common.collect.Maps.transformValues(multiSourceSelect.sources(), new com.google.common.base.Function<io.crate.analyze.relations.MultiSourceSelect.Source, io.crate.analyze.relations.AnalyzedRelation>() {
        @java.lang.Override
        public io.crate.analyze.relations.AnalyzedRelation apply(io.crate.analyze.relations.MultiSourceSelect.Source input) {
            return input.relation();
        }
    });
}