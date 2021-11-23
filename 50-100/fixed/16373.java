private void addPackingmaterialToItem(final de.metas.adempiere.model.I_M_Product packackingProduct, final de.metas.handlingunits.model.I_M_HU_PI_Item materialPiItem) {
    final de.metas.handlingunits.model.I_M_HU_PackingMaterial packingMaterial = org.adempiere.model.InterfaceWrapperHelper.create(org.compiere.util.Env.getCtx(), de.metas.handlingunits.model.I_M_HU_PackingMaterial.class, ITrx.TRXNAME_None);
    packingMaterial.setM_Product(packackingProduct);
    org.adempiere.model.InterfaceWrapperHelper.save(packingMaterial);
    final de.metas.handlingunits.model.I_M_HU_PI_Item packingMaterialPiItem = org.adempiere.model.InterfaceWrapperHelper.create(org.compiere.util.Env.getCtx(), de.metas.handlingunits.model.I_M_HU_PI_Item.class, ITrx.TRXNAME_None);
    packingMaterialPiItem.setItemType(X_M_HU_PI_Item.ITEMTYPE_PackingMaterial);
    packingMaterialPiItem.setM_HU_PackingMaterial(packingMaterial);
    packingMaterialPiItem.setM_HU_PI_Version(materialPiItem.getM_HU_PI_Version());
    org.adempiere.model.InterfaceWrapperHelper.save(packingMaterialPiItem);
}