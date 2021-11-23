public void start(java.lang.String myBaseId, java.lang.String enemyBaseId, java.util.Set<java.lang.String> enemyIds) {
    this.myBaseId = myBaseId;
    this.enemyBaseId = enemyBaseId;
    this.enemyIds = enemyIds;
    android.util.Log.d("Start game", ((((myBaseId + ":") + enemyBaseId) + ":") + enemyIds));
}