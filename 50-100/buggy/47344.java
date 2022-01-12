public java.lang.String register() {
    try {
        message = "";
        transactionFailure = null;
        if ((controller.getPerson(username)) != null) {
            setMessage("This username already exists. Please, choose another one.");
            return "login";
        }else {
            controller.createPerson(username, email, name, password, surname);
            setMessage("You have been successfully registered. Now you can log in.");
            return "confirmation";
        }
    } catch (java.lang.Exception e) {
        handleException(e);
    }
    return jsf22Bugfix();
}