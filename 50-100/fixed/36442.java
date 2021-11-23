private int getScore(java.util.ArrayList<ec2017.ga.general.Individual> candidates, int index) {
    int score = 0;
    for (int i = 0; i < (_q); i++) {
        if ((candidates.get(index).getFitness()) > (candidates.get(((int) ((java.lang.Math.random()) * (candidates.size())))).getFitness())) {
            score++;
        }
    }
    return -score;
}