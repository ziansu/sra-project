private static net.jroux.musicgen.lib.Score teachNewScoreObj() {
    net.jroux.musicgen.lib.Score score = new net.jroux.musicgen.lib.Score(Config.learnerMemory);
    net.jroux.musicgen.lib.Teacher.teach(Config.learningSaples[8], score);
    score.normalizeMatrix();
    return score;
}