private org.jooq.Select<org.jooq.Record1<java.lang.Long>> mkForPhysicalFlow(com.khartec.waltz.model.IdSelectionOptions options) {
    ensureScopeIsExact(options);
    long physicalFlowId = options.entityReference().id();
    return org.jooq.impl.DSL.select(PHYSICAL_SPECIFICATION.ID).from(com.khartec.waltz.schema.tables.PhysicalSpecification.PHYSICAL_SPECIFICATION).innerJoin(com.khartec.waltz.schema.tables.PhysicalFlow.PHYSICAL_FLOW).on(PHYSICAL_FLOW.SPECIFICATION_ID.eq(PHYSICAL_SPECIFICATION.ID)).innerJoin(com.khartec.waltz.schema.tables.PhysicalFlowLineage.PHYSICAL_FLOW_LINEAGE).on(PHYSICAL_FLOW_LINEAGE.CONTRIBUTOR_FLOW_ID.eq(PHYSICAL_FLOW.ID)).where(PHYSICAL_FLOW_LINEAGE.DESCRIBED_FLOW_ID.eq(physicalFlowId).or(PHYSICAL_FLOW_LINEAGE.CONTRIBUTOR_FLOW_ID.eq(physicalFlowId)));
}