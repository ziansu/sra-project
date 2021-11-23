@org.springframework.web.bind.annotation.RequestMapping(value = "/details/{id}")
public com.doclerholding.hackaton.data.model.airquality.AirQualityDetails getDetailsById(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) throws com.fasterxml.jackson.core.JsonProcessingException {
    return this.detailsService.getAirQualityDetail(id);
}