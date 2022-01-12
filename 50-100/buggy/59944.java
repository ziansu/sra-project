private java.lang.Long getUserIdIfExist(com.codeproj.traininghandler.dto.TrainingExcelDto item) {
    java.lang.String email = item.getEmail();
    if (org.apache.commons.lang3.StringUtils.isEmpty(email)) {
        java.lang.String cleanedPhoneNo = com.codeproj.traininghandler.util.ThStringUtils.cleanPhoneNumber(item.getPhoneNo());
        email = cleanedPhoneNo + (com.codeproj.traininghandler.util.Constants.EXCEL_TRAINING_MISSING_EMAIL_DOMAIN);
    }
    com.codeproj.traininghandler.rest.common.GeneralIdResponse userId = getUserIdByEmail(email);
    return userId.getValue();
}