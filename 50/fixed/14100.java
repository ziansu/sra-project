@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteRecord/{app_name}/{record_id}/{form_id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public int deleteRecord(@org.springframework.web.bind.annotation.PathVariable(value = "app_name")
java.lang.String appName, @org.springframework.web.bind.annotation.PathVariable(value = "record_id")
java.lang.String rowId, @org.springframework.web.bind.annotation.PathVariable(value = "form_id")
java.lang.String formId) throws java.sql.SQLException {
    formTemplatesService.deleteRecord(appName, rowId, formId);
    return 1;
}