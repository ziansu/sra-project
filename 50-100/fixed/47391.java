private static Controller.Player getBestPlayer(java.util.ArrayList<Controller.Player> list) {
    Controller.Player res = list.get(0);
    double score = Controller.CreateSelection.getPlayerScore(res);
    for (int i = 0; i < (list.size()); i++) {
        if ((Controller.CreateSelection.getPlayerScore(list.get(i))) > score) {
            res = list.get(i);
        }
    }
    return res;
}