@org.junit.Test
public void shouldTranslateAllele() {
    me.zeph.relations.model.entity.KitEntity kitEntity = getKitEntity(getAlleleEntity(1L, "name"), 1L, "name", true);
    when(kitRepository.findOne(1L)).thenReturn(kitEntity);
    me.zeph.relations.model.api.Allele allele = alleleService.getAllele(1L, 1L);
    org.junit.Assert.assertThat(allele.getAlleleId(), org.hamcrest.CoreMatchers.is(1L));
}