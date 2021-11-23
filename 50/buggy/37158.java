@java.lang.Override
public void respondToAccusationAgainstMe(com.sortedunderbelly.pardons.Accusation accusation, com.sortedunderbelly.pardons.Pardons derivedPardons, com.sortedunderbelly.pardons.PardonsUIListener listener) {
    accusationsAgainstMe.remove(derivedPardons);
    sentPardons.add(derivedPardons);
    listener.onRespondToAccusationAgainstMeComplete(derivedPardons);
}