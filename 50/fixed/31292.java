@java.lang.Override
public void damage(int amount) {
    if ((agent.getShooter()) == null)
        return ;
    
    agent.getShooter().damage(amount);
}