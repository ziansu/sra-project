public void showException(java.lang.Exception ex) {
    java.lang.String message = null;
    if ((ex instanceof util.exceptions.IncorrectInputException) || (ex instanceof util.exceptions.OperationDoesNotAllowed)) {
        message = ex.getMessage();
    }else
        if (ex instanceof java.io.IOException) {
            message = "Input / output error";
        }else
            if (ex instanceof java.text.ParseException) {
                message = "Inputted date is incorrect, please input in format dd/MM/YYYY";
            }else
                if (ex instanceof java.lang.Exception) {
                    message = "Unexpected error";
                }
            
        
    
    java.lang.System.out.println(message);
}