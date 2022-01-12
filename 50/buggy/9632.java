public void addBank(int index) {
    if ((((Cards) (hand.get(index))).getID()) >= 11) {
        bank.add(hand.remove(index));
    }
}