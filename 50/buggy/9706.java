@java.lang.Override
public void update(float tpf) {
    sendMonstersToUI();
    updateMonsterSelection();
    if ((attackResults) != null) {
        executeAttackResults();
        if ((attackResults) == null) {
            finishActionAndGoOn();
        }
    }
}