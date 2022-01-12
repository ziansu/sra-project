private void setCardsProperlyToOrder() {
    int index = 1;
    for (java.util.List<com.axandar.makaoCore.logic.Function> functionList : com.axandar.makaoServer.TableServer.functionsList) {
        int i = 0;
        for (com.axandar.makaoCore.logic.Function fucntion : functionList) {
            if ((fucntion.getFunctionID()) == (com.axandar.makaoCore.logic.Function.NOTHING)) {
                i++;
            }
        }
        if (i == 4) {
            sessionInfo.addSuitableCardsToOrder(index);
        }
        index++;
    }
}