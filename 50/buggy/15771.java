@org.springframework.web.bind.annotation.ModelAttribute(value = "receivingCenters")
public java.util.List<org.egov.pgr.entity.ReceivingCenter> receivingCenters() {
    return this.receivingCenterService.findAll();
}