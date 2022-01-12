public java.lang.String getProfitPolicy() {
    if ((currentUser) instanceof fr.ecp.IS1220.group5.project.Manager) {
        switch (profitPolicy) {
            case 0 :
                java.lang.System.out.println("by Service fee");
                return "by Service fee";
            case 1 :
                java.lang.System.out.println("by Markup Percentage");
                return "by Markup Percentage";
            case 2 :
                java.lang.System.out.println("by Delivery Cost");
                return "by Delivery Price";
            default :
                java.lang.System.out.println("error");
        }
    }else {
        java.lang.System.out.println("you must log in first");
    }
    return "error";
}