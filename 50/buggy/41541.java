private float[] getAgentSpeed(int Id, com.mygdx.game.android.GameState.AgentInfo[] Status) {
    if ((Status[Id]) == null)
        java.lang.System.out.println(("Exception null Status Block : " + Id));
    
    return Status[Id].speedVector;
}