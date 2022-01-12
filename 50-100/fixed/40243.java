public java.lang.String getFieldValue(java.lang.String fieldName) {
    switch (fieldName.toUpperCase()) {
        case "ID" :
            return id.getText();
        case "ADMINISTRATOR NAME" :
            return adminName.getText();
        case "ADMINISTRATOR EMAIL" :
            return adminEmail.getText();
        case "EMAIL CONFIRMED" :
            return emilConfirmed.getText();
        case "ROLE" :
            return role.getText();
    }
    return null;
}