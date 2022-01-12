public static void main(java.lang.String[] args) {
    com.mweser.Log.LogSelector.setHandResultLogging();
    com.mweser.Gameplay.GameManagement.Table newTable = new com.mweser.Gameplay.GameManagement.Table(5, 5, 8, 100);
    newTable.run();
}