public void movementList() {
    int acc = chooseAccount();
    if (acc >= 0) {
        java.lang.System.out.println(getCustomer(acc).getAccount());
    }else {
        java.lang.System.out.println("That account doesnt exists");
    }
}