public ItemRelease.Item newShortAnswerItem(java.lang.String itemId, java.lang.String... languages) {
    final org.opentestsystem.saaif.item.ItemRelease.Item.Attriblist attributeList = newItemAttributeList(itemId, ItemFormat.FORMAT_SHORT_ANSWER, ItemPageLayout.PAGE_LAYOUT_SHORT_ANSWER, ItemResponseType.RESPONSE_TYPE_HTML_EDITOR);
    final org.opentestsystem.saaif.item.ItemRelease.Item item = org.opentestsystem.saaif.item.ItemFactory.OBJECT_FACTORY.createItemreleaseItem();
    item.setId(itemId);
    item.setFormat(ItemFormat.FORMAT_SHORT_ANSWER);
    item.setVersion(ItemVersion.ITEM_VERSION);
    item.setAttriblist(attributeList);
    if (languages != null) {
        for (java.lang.String lang : languages) {
            item.getContent().add(newContent(lang));
        }
    }
    return item;
}