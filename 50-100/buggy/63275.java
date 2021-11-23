@java.lang.Override
public void run() {
    while (true)
        try {
            for (StrongholdCrusader.Network.ServerPlayer player : players) {
                for (StrongholdCrusader.GameObjects.GameObject gameObject : getGameObjectByPlayerName(player.playerName)) {
                    if ((gameObject instanceof StrongholdCrusader.GameObjects.Humans.Vassal) || (gameObject instanceof StrongholdCrusader.GameObjects.Humans.Worker)) {
                        player.foods -= 1;
                        java.lang.System.out.println(player.foods);
                    }
                    if (gameObject instanceof StrongholdCrusader.GameObjects.Humans.Soldier) {
                        java.lang.System.out.println("Solier");
                        player.foods -= 2;
                    }
                }
            }
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    
}