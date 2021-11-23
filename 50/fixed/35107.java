@com.softserve.edu.documents.document.meta.Placeholder(name = "VERIFICATOR_MAIL")
public java.lang.String getVerificatorMail() {
    com.softserve.edu.entity.Organization verificator = getVerification().getStateVerificator();
    if (verificator != null) {
        return verificator.getEmail();
    }
    return "None";
}