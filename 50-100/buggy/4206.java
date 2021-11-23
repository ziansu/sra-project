public static java.lang.String getErrorMsg(java.sql.SQLException e) {
    java.lang.String errorMsg = e.getMessage();
    if (errorMsg.contains("foreign key constraint")) {
        errorMsg = "At least one value is inconsistent with existing data in other dimensions";
    }else
        if (errorMsg.contains("duplicate key value violates unique constraint")) {
            errorMsg = "Key value is already present";
        }else {
            errorMsg = "Data is invalid";
        }
    
    return errorMsg;
}