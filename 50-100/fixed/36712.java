@org.springframework.web.bind.annotation.PostMapping(value = "/servicer/submit-service")
public java.lang.String submitServiceRecord(@org.springframework.web.bind.annotation.ModelAttribute
com.codeup.Controllers.ServiceRecords record, @org.springframework.web.bind.annotation.RequestParam(name = "service_record_id")
int id) {
    com.codeup.Controllers.ServiceRecords svcRecord = serviceRecordsSvc.findRecordbyId(id);
    svcRecord.setParts_installed(record.getParts_installed());
    svcRecord.setDesc_service(record.getDesc_service());
    serviceRecordsSvc.save(svcRecord);
    return "redirect:/servicer/dashboard";
}