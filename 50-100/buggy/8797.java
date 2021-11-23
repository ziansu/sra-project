@com.softserve.edu.documents.document.meta.Placeholder(name = "OWNER_NAME")
public java.lang.String getOwnerFullName() {
    com.softserve.edu.entity.verification.ClientData ownerData = getVerification().getClientData();
    java.lang.String fullName = ((((ownerData.getLastName()) + " ") + (ownerData.getFirstName())) + " ") + (ownerData.getMiddleName());
    return fullName;
}