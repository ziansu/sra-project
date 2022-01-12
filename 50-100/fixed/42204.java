public java.lang.String getNameSurname() {
    if ((((name) != null) && ((surname) != null)) && ((badgeNumber) != null)) {
        return (((((surname) + " ") + (name)) + " (") + (badgeNumber)) + ")";
    }
    return "";
}