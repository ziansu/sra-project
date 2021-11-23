public java.util.List<org.opensrp.dto.CountServiceDTOForChart> getHHCountInformation() {
    org.ektorp.ViewResult hhViewResult;
    hhViewResult = allHouseHolds.allHHsCreatedLastFourMonthsViewResult();
    java.util.List<org.opensrp.dto.CountServiceDTOForChart> DTOs = new java.util.ArrayList<org.opensrp.dto.CountServiceDTOForChart>();
    org.opensrp.dto.CountServiceDTOForChart newDTO = new org.opensrp.dto.CountServiceDTOForChart();
    newDTO.setCounts(this.convertViewResultToCount(hhViewResult));
    DTOs.add(newDTO);
    return DTOs;
}