@java.lang.Override
public void validate(org.restfulwhois.rdap.common.support.QueryParam queryParam, org.restfulwhois.rdap.common.validation.ValidationResult validationResult) {
    java.lang.String q = queryParam.getQ();
    java.lang.String[] splits = org.apache.commons.lang.StringUtils.split(q, ".");
    for (java.lang.String split : splits) {
        if (2 != (org.apache.commons.lang.StringUtils.indexOf(split, "--"))) {
            return ;
        }
        if (!(org.restfulwhois.rdap.common.util.IdnaUtil.checkIfValidALabelDomain(q))) {
            validationResult.addError(org.restfulwhois.rdap.common.validation.QueryValidationError.build400Error());
            return ;
        }
    }
}