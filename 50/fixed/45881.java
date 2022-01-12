@java.lang.Override
public void queueSpawn(int opt) {
    if ((buildQueue.isEmpty()) && ((MainGame.minerals) >= (buildCosts[opt]))) {
        buildQueue.add(opt);
        MainGame.minerals -= buildCosts[opt];
    }
}