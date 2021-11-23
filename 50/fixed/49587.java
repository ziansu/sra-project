@java.lang.Override
public void embark(ma223ku_assign2.Exercise_2.Passenger p) {
    if (!(totalpassengers.contains(p))) {
        totalpassengers.add(p);
        moneyEarned += p.getPassengerCost();
    }
}