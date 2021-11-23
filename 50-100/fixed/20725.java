@org.springframework.web.bind.annotation.RequestMapping(value = "/checkForDuplicateFundingSource", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { org.springframework.http.MediaType.TEXT_PLAIN_VALUE })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String checkForDuplicateFundingSource(@org.springframework.web.bind.annotation.RequestParam
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestParam
java.lang.String fiscalYear, @org.springframework.web.bind.annotation.RequestParam
java.lang.String startDate, @org.springframework.web.bind.annotation.RequestParam
java.lang.String endDate, @org.springframework.web.bind.annotation.RequestParam
java.lang.String name) throws java.lang.Exception {
    boolean fundingSourceOk = fundingsourcemanager.checkForDuplicateFundingSource(programId, id, fiscalYear, startDate, endDate, name);
    if (fundingSourceOk == true) {
        return "0";
    }else {
        return "1";
    }
}