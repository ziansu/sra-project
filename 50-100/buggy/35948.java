public java.lang.String getCode() {
    if (settings.Code.matches(".*[*#qwertyuiopsfghjklzxvnmQWERTYUIOPSFGHJKLZXVNM!�$%^&*()-_+#=*}].*")) {
        settings.Code = "1234";
        return "1234";
    }else {
        if ((settings.Code) == "") {
            settings.Code = "1234";
            return "1234";
        }else {
            return settings.Code;
        }
    }
}