@java.lang.Override
public boolean dealersTurn() {
    for (Person.Person person : getOnlyActivePlayers()) {
        if (((person.getLastBet()) != (highestBet)) || (!((playersFinished) >= (getActivePlayers().size())))) {
            return false;
        }
    }
    return true;
}