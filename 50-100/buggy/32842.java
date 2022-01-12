@java.lang.Override
public boolean validate() {
    this.errorMessage = null;
    javax.servlet.http.HttpServletRequest request = com.services.shared.ServiceManager.getInstance().getSharedResources().getRequest();
    java.lang.String paramValue = request.getParameter(this.paramName);
    if (paramValue == "on") {
        this.value = true;
        return true;
    }else
        if (paramValue == null) {
            this.value = false;
            return true;
        }else {
            errorMessage = "Неправильный формат значения!";
            return false;
        }
    
}