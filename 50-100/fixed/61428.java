private void buildSubMenu(final java.lang.String subMenu) {
    switch (subMenu) {
        case "1" :
            printClientMenu();
            break;
        case "2" :
            printVehicleMenu();
            break;
        case "3" :
            printBookingMenu();
            break;
        default :
            printError();
            break;
    }
}