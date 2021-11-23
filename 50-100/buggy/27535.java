@org.junit.Test
public void testSplitCU_To_NewCU_MaxValueNoParent() {
    final de.metas.handlingunits.model.I_M_HU cuToSplit = mkRealStandAloneCUToSplit("3");
    org.junit.Assert.assertThat(cuToSplit.getM_HU_Item_Parent(), nullValue());
    final java.util.List<de.metas.handlingunits.model.I_M_HU> newCUs = de.metas.handlingunits.allocation.transfer.HUTransferService.get(data.helper.getHUContext()).splitCU_To_NewCU(cuToSplit, data.helper.pTomato, data.helper.uomKg, new java.math.BigDecimal("3"));
    org.junit.Assert.assertThat(newCUs.size(), org.hamcrest.Matchers.is(0));
}