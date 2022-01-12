@org.springframework.web.bind.annotation.PostMapping(value = "/servicer/submit-service")
public java.lang.String submitServiceRecord(@org.springframework.web.bind.annotation.ModelAttribute
com.codeup.Controllers.ServiceRecords record) {
    com.codeup.Controllers.ServiceRecords svcRecord = serviceRecordsSvc.findRecordbyId(record.getId());
    svcRecord.setParts_installed(record.getParts_installed());
    svcRecord.setDesc_service(record.getDesc_service());
    serviceRecordsSvc.save(svcRecord);
    return "redirect:/servicer/dashboard";
}