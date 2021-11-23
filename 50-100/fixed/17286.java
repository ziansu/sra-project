public static ItemRelease.Passage.Attriblist newSaaifStimAttributeList(final java.lang.String itemId) {
    final org.opentestsystem.ap.common.saaif.item.ItemRelease.Passage.Attriblist attriblist = org.opentestsystem.ap.common.mapper.StimMapper.OBJECT_FACTORY.createItemreleasePassageAttriblist();
    attriblist.getAttrib().add(org.opentestsystem.ap.common.mapper.StimMapper.newSaaifAttribute(org.opentestsystem.ap.common.model.ItemConstants.ItemAttribute.StimPassId, itemId));
    attriblist.getAttrib().add(org.opentestsystem.ap.common.mapper.StimMapper.newSaaifAttribute(org.opentestsystem.ap.common.model.ItemConstants.ItemAttribute.StimPassSubject, org.apache.commons.lang3.StringUtils.EMPTY));
    attriblist.getAttrib().add(org.opentestsystem.ap.common.mapper.StimMapper.newSaaifAttribute(org.opentestsystem.ap.common.model.ItemConstants.ItemAttribute.StimPassDesc, org.apache.commons.lang3.StringUtils.EMPTY));
    return attriblist;
}