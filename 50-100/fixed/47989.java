@java.lang.Override
public void onRequestSuccess(com.goupwards.kyc.documentuploadsave.DocumentUploadStateResponse documentUploadStateResponse) {
    com.goupwards.kyc.documentuploadsave.DocumentUploadState documentUploadState = documentUploadStateResponse.getData().getDocumentUploadState();
    isProfileUploaded = documentUploadState.getProfilePic();
    isAadharUploaded = documentUploadState.getAadhar();
    isAddressUploaded = documentUploadState.getCurrentAddress();
    isPanCardUploaded = documentUploadState.getPan();
    isSalarySlipUploaded = documentUploadState.getSalarySlip();
    updateUI();
}