public void updateExameDate(logic.Problem problem, algorithm.Individual bestIndividual) {
    java.util.ArrayList<java.lang.Integer[]> aux = utils.Utils.splitChromossome(bestIndividual.getChromossome(), problem.getByteDays());
    for (int i = 0; i < (problem.getNumberOfExames()); i++) {
        int date = utils.Utils.byteToInt(aux.get(i));
        problem.getExame(i).setDate(date);
    }
}