private com.curus.httpio.response.ErrorData validate() {
    if (((errorData = com.curus.utils.validate.ValueValidate.valueExistValidate(request.getToken(), "token")) != null) || ((errorData = com.curus.utils.validate.ValueValidate.valueExistValidate(request.getPatient_id(), "patient_id")) != null)) {
        logger.warn(com.curus.utils.LogUtils.Msg(errorData, request));
    }
    return errorData;
}