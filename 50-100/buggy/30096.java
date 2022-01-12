private int RandomWithExclusion(java.util.Random rnd, int start, int end, java.util.ArrayList<java.lang.Integer> exclude) {
    int random = start + (rnd.nextInt((((end - start) + 1) - (exclude.size()))));
    for (int ex : exclude) {
        android.util.Log.d("exclude", ("" + ex));
        if (random < ex) {
            break;
        }
        random++;
    }
    return random;
}