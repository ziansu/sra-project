public boolean profCard() {
    boolean b = false;
    for (int x = 0; x < (view.cardAL.size()); x++) {
        if ((((view.cardAL.get(x).getOwner()) != null) && (view.cardAL.get(x).getType().equals("Prof"))) && (view.cardAL.get(x).getOwner().equals(client.ClientController.clientOwner))) {
            b = true;
        }
    }
    return b;
}