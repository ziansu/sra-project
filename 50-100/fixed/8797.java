@com.softserve.edu.documents.document.meta.Placeholder(name = "OWNER_NAME")
public java.lang.String getOwnerFullName() {
    com.softserve.edu.entity.verification.ClientData ownerData = getVerification().getClientData();
    return ((((ownerData.getLastName()) + " ") + (ownerData.getFirstName())) + " ") + (ownerData.getMiddleName());
}