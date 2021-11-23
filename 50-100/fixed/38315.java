public java.lang.String parseTweet(java.lang.String[] words) {
    if (((words.length) >= 2) && (words[1].equalsIgnoreCase(primes.PrimeTweet.RandomPrime.CMD_STRING))) {
        int[] pl = p.getPrimesList();
        return "" + (pl[new java.util.Random().nextInt(pl.length)]);
    }
    return null;
}