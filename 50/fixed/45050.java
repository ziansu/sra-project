@com.softserve.edu.documents.document.meta.Placeholder(name = "VERIFICATOR_ID")
public java.lang.String getVerificatorId() {
    com.softserve.edu.entity.Organization verificator = getVerification().getStateVerificator();
    if (verificator != null) {
        return java.lang.String.valueOf(verificator.getId());
    }
    return "None";
}