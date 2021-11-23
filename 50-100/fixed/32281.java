public Model.MinionImpl chooseTarget(java.util.ArrayList<Model.MinionImpl> enemies) {
    Model.MinionImpl target = new Model.MinionImpl();
    double minDist = 9999999;
    for (Model.MinionImpl warrior : enemies) {
        double dist = cal_distance(warrior);
        if (dist < minDist) {
            minDist = dist;
            target = warrior;
        }
    }
    return target;
}