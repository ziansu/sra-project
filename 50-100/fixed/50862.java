public static void startApplication(java.lang.String mode) {
    if (mode.equals("Cashier")) {
        se.humanus.DigitCashier.CashRegisterWindow.activateCashRegister();
    }else
        if (mode.equals("Admin")) {
            se.humanus.DigitCashier.AdminWindow.ativateAdminWindow();
        }else
            if (mode.equals("Chef")) {
                java.lang.System.out.println("Not implemented yet.");
            }
        
    
}