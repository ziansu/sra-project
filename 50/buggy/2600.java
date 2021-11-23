public Model.Card[] pickUpBlind(java.lang.String username) {
    Model.Card[] temp = blind;
    blind = null;
    if (printAll)
        java.lang.System.out.println((("\t" + username) + " picked up \n"));
    
    return temp;
}