public static synchronized org.protasov.ii.pageobjects.LoginPanel init() {
    if ((org.protasov.ii.pageobjects.LoginPanel._instance) == null)
        synchronized(org.protasov.ii.pageobjects.LoginPanel.class) {
            if ((org.protasov.ii.pageobjects.LoginPanel._instance) == null)
                org.protasov.ii.pageobjects.LoginPanel._instance = new org.protasov.ii.pageobjects.LoginPanel(driver);
            
        }
    
    return org.protasov.ii.pageobjects.LoginPanel._instance;
}