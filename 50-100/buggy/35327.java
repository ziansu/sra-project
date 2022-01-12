private double calculateClientSellAmount(Client c) {
    java.lang.System.out.println(c.getName());
    double networth = c.getNetworth();
    java.lang.System.out.println(("Clients networth in calculateClientSellAmount: " + networth));
    double sellLimit = 0;
    switch (mode) {
        case AGGRESSIVESELLER :
            sellLimit = (networth / 100) * 0.02;
        case BALANCED :
            sellLimit = (networth / 100) * 0.01;
        case AGGRESSIVEBUYER :
            sellLimit = (networth / 100) * 0.005;
    }
    java.lang.System.out.println(("sell limit: " + sellLimit));
    return sellLimit;
}