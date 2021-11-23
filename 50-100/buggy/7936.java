@java.lang.Override
public void add(com.ivstuart.tmud.person.carried.Money money) {
    java.util.ListIterator<com.ivstuart.tmud.person.carried.SomeMoney> moneyItr = list.listIterator();
    while (moneyItr.hasNext()) {
        com.ivstuart.tmud.person.carried.Money aMoney = ((com.ivstuart.tmud.person.carried.Money) (moneyItr.next()));
        if (aMoney.isSameType(money)) {
            aMoney.add(money);
            if (aMoney.isEmpty()) {
                moneyItr.remove();
            }
            return ;
        }
    } 
    moneyItr.add(money);
}