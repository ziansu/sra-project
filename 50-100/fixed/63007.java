private void getDetailsToDeleteTimeSheetsAndContracts(int yearToSubtract) {
    java.time.LocalDate today = java.time.LocalDate.now();
    java.time.LocalDate x = today.minusYears(yearToSubtract);
    try {
        timeSheetBusinessLogic.deleteOldTimeSheetSignedBySupervisor(x);
    } catch (java.lang.NumberFormatException ne) {
        java.lang.System.out.println("Exception Occured from timeSheetBusinessLogic!!");
    }
}