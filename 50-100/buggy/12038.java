@org.springframework.web.bind.annotation.RequestMapping(value = "/datatype/{id}/html", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "text/html")
public java.lang.String getDatatypeAsHtml(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id, @org.springframework.web.bind.annotation.PathVariable(value = "format")
java.lang.String format) throws gov.nist.healthcare.tools.hl7.v2.igamt.lite.web.exception.DataNotFoundException {
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype datatype = datatypeService.findById(id);
    if ((datatype != null) && (datatype.getScope().equals(SCOPE.HL7STANDARD))) {
        return exportService.exportDataModelAsHtml(datatype);
    }
    return null;
}