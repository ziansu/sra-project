private void buildSubMenu(final java.lang.String subMenu) {
    switch (subMenu) {
        case "1" :
            printClientMenu();
            printSubMenu(subMenu);
            break;
        case "2" :
            printVehicleMenu();
            printSubMenu(subMenu);
            break;
        case "3" :
            printBookingMenu();
            printSubMenu(subMenu);
            break;
        default :
            printError();
            break;
    }
}