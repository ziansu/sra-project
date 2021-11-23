int FindBestInLevel(int t) {
    double best = alpha[t][0];
    int best_index = 0;
    for (int i = 1; i < ((this.constant) * (this.number_of_topic)); i++) {
        if ((alpha[t][i]) > best) {
            best = alpha[t][i];
            best_index = i;
        }
    }
    return best_index;
}