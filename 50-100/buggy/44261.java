@java.lang.Override
public boolean dealersTurn() {
    java.lang.System.out.println(playersFinished);
    for (Person.Person person : getOnlyActivePlayers()) {
        if (((person.getLastBet()) != (highestBet)) || (!((playersFinished) >= (getActivePlayers().size())))) {
            return false;
        }
    }
    return true;
}