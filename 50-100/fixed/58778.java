public void removeAllEmployeeServices(java.lang.String b, java.lang.String e) {
    coreFunctions.WriteToFile w = new coreFunctions.WriteToFile();
    for (int j = 0; j < (bookings.Services.serviceList.size()); j++) {
        boolean index = checkEID(j, e);
        if (!index) {
            bookings.Services.serviceList.get(j).emp.remove((index - 1));
        }
    }
    rewriteToFile(bookings.Services.serviceList, "services.txt");
}