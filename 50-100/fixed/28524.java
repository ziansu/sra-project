public java.lang.String getProfitPolicy() {
    if ((currentUser) instanceof fr.ecp.IS1220.group5.project.Manager) {
        switch (profitPolicy) {
            case 0 :
                return "by Service fee";
            case 1 :
                return "by Markup Percentage";
            case 2 :
                return "by Delivery Price";
            default :
                java.lang.System.out.println("error");
        }
    }else {
        java.lang.System.out.println("you must log in first");
    }
    return "error";
}