@java.lang.Override
public void onFinish() {
    if (((banks) != null) && ((banks.size()) > 0)) {
        int max = (banks.size()) - 1;
        java.util.Random peopleRandom = new java.util.Random();
        int randomID = peopleRandom.nextInt(max);
        (banks.get(randomID).totalPeople)++;
        android.util.Log.d("TIMER", ("Added people to bank with id: " + randomID));
        addPeopleCDT.start();
    }
}