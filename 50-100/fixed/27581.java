private void addNameAttributeToMap(java.util.Map<java.lang.String, java.lang.String> map, com.xpn.xwiki.doc.XWikiDocument cellDoc) {
    com.google.common.base.Optional<java.lang.String> val = service.getAttributeName(cellDoc);
    if (val.isPresent()) {
        map.put("name", val.get());
    }
}