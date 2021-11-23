private void chooseIdentity() {
    isBuyer = (java.lang.Math.random()) >= 0.5;
    if (isBuyer)
        myInfo = new Buyer();
    else
        myInfo = new Seller();
    
}