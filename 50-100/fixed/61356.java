@org.springframework.web.bind.annotation.RequestMapping(value = tel_ran.tests.services.common.ICommonData.TESTS_RESULTS, method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
@com.fasterxml.jackson.annotation.JsonRawValue
java.lang.String all(@org.springframework.web.bind.annotation.RequestHeader(value = "TimeZone")
java.lang.String timeZone, @org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String token) {
    if ((companyId) == 0)
        companyId = tokenProcessor.decodeAndCheckToken(token);
    
    java.lang.String res = "";
    if ((companyId) != (-1)) {
        res = company.getTestsResultsAll(companyId, timeZone);
    }else {
        res = getJsonErrorMessage();
    }
    return res;
}