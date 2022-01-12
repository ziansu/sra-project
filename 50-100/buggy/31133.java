public java.lang.String getNerdTitle(int Score) {
    for (int i = 0; i < ((ranks.size()) / 2); i += 2) {
        if (Score < (java.lang.Integer.parseInt(ranks.get((i + 2))))) {
            return ranks.get((i + 1));
        }
    }
    return "no Rank";
}