public static short categoryLevel(java.lang.String category) {
    for (short level = 1; level < 101; level++) {
        for (Controlleur.Question q : Controlleur.JavaOverflow.database.getQuestions()) {
            if ((q.getDifficulty()) == level) {
                if (q.getCategory().equals(category)) {
                    if (!(q.isDone())) {
                        return level;
                    }
                }
            }
        }
    }
    return 100;
}