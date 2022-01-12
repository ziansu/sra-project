@com.softserve.edu.documents.document.meta.Placeholder(name = "VERIFICATOR_SHORT_NAME")
public java.lang.String getStateVerificatorShortName() {
    com.softserve.edu.entity.user.User stateVerificatorEmployee = getVerification().getStateVerificatorEmployee();
    return (((((stateVerificatorEmployee.getLastName()) + " ") + (stateVerificatorEmployee.getFirstName().charAt(0))) + ".") + (stateVerificatorEmployee.getMiddleName().charAt(0))) + ".";
}