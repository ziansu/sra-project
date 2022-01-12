@org.springframework.web.bind.annotation.RequestMapping(value = "/emp/myview/searchBaseDescription/searchBaseItems.do", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.psk.pms.model.DescItemDetail.ItemDetail> searchBaseItem(@org.springframework.web.bind.annotation.RequestParam(value = "itemName")
java.lang.String itemName, @org.springframework.web.bind.annotation.RequestParam(value = "itemType")
java.lang.String itemType, @org.springframework.web.bind.annotation.RequestParam(value = "descType")
java.lang.String descType) {
    com.psk.pms.controller.SearchController.LOGGER.info("method = getDescItem()");
    java.util.Map<java.lang.String, java.lang.Object> request = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    request.put("itemName", itemName.toUpperCase());
    request.put("itemType", itemType.toUpperCase());
    request.put("descType", descType.toLowerCase());
    java.util.List<com.psk.pms.model.DescItemDetail.ItemDetail> itemsDetail = itemService.getBaseItemNames(request);
    return itemsDetail;
}