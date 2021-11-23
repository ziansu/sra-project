public void showOrder() {
    if ((user) instanceof fr.ecp.IS1220.group5.project.Customer) {
        if ((currentOrder) != null) {
            currentOrder.showOrder();
            java.lang.System.out.println(fr.ecp.IS1220.group5.project.Money.display(currentOrder.getTotal_price()));
        }else {
            java.lang.System.out.println("you have to choose a restaurant first");
        }
    }else {
        java.lang.System.out.println("You must log in first");
    }
}