@org.springframework.web.bind.annotation.RequestMapping(value = "/esignDoc", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<org.dmc.services.data.models.eSignStatus> signDocument(@org.springframework.web.bind.annotation.RequestBody
java.lang.String CompanyInfo) {
    try {
        java.lang.String response = eSignService.eSignField(CompanyInfo);
        java.lang.System.out.println(("response" + response));
        return new org.springframework.http.ResponseEntity<org.dmc.services.data.models.eSignStatus>(new org.dmc.services.data.models.eSignStatus(response, "eSignature Successful!"), org.springframework.http.HttpStatus.OK);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("failed");
        return new org.springframework.http.ResponseEntity<org.dmc.services.data.models.eSignStatus>(new org.dmc.services.data.models.eSignStatus(response, "eSignature Failed!"), org.springframework.http.HttpStatus.OK);
    }
}