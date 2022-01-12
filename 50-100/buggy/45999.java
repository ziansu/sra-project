static java.lang.String replaceString(java.lang.String contact) {
    try {
        java.lang.String parsedString = contact.replace("(", "").replace(")", "").trim();
        return parsedString;
    } catch (java.lang.Exception e) {
        whatsapp.Global.exception.error("Exception in replaceString", e);
    }
    return contact;
}