@org.junit.Test
public void shouldTranslateAlleles() {
    me.zeph.relations.model.entity.KitEntity kitEntity = getKitEntity(getAlleleEntity(1L, "name"), 1L, "name", true);
    when(kitRepository.findOne(1L)).thenReturn(kitEntity);
    java.util.List<me.zeph.relations.model.api.Allele> alleles = alleleService.getAlleles(1L);
    org.junit.Assert.assertThat(alleles.size(), org.hamcrest.CoreMatchers.is(1));
    org.junit.Assert.assertThat(alleles.get(0).getAlleleId(), org.hamcrest.CoreMatchers.is(1L));
}