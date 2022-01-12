@org.springframework.web.bind.annotation.RequestMapping(value = "/getDistributedFacilities", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.openlmis.core.web.OpenLmisResponse> getDistributedFacilities(@org.springframework.web.bind.annotation.RequestParam(value = "periodId")
java.lang.Long periodId, @org.springframework.web.bind.annotation.RequestParam(value = "facilityId")
java.lang.Long facilityId, @org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.String type, @org.springframework.web.bind.annotation.RequestParam(value = "page", defaultValue = "1")
java.lang.Integer page, @org.springframework.beans.factory.annotation.Value(value = "${search.page.size}")
java.lang.String limit) {
    org.openlmis.core.domain.Pagination pagination = new org.openlmis.core.domain.Pagination(page, java.lang.Integer.parseInt(limit));
    org.openlmis.core.web.OpenLmisResponse openLdrResponse = new org.openlmis.core.web.OpenLmisResponse("distributedFacilities", service.getDistributedFacilities(periodId, facilityId, type, pagination));
    pagination.setTotalRecords(service.getTotalDistributedFacilities(periodId, facilityId, type));
    openLdrResponse.addData("pagination", pagination);
    return openLdrResponse.response(org.springframework.http.HttpStatus.OK);
}