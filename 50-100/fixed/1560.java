private void randomize() {
    for (int i = 0; i < (n); i++) {
        int swapIndex = edu.princeton.cs.algs4.StdRandom.uniform((i + 1));
        Item temp = randomQueue[i];
        randomQueue[i] = randomQueue[swapIndex];
        randomQueue[swapIndex] = temp;
    }
}