@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if ((arg instanceof edu.chl.blastinthepast.model.ProjectileInterface) && (o instanceof java.lang.Character)) {
        addProjectile(((edu.chl.blastinthepast.model.ProjectileInterface) (arg)));
    }else
        if (arg instanceof edu.chl.blastinthepast.model.PowerUp) {
            edu.chl.blastinthepast.model.PowerUp powerUp = ((edu.chl.blastinthepast.model.PowerUp) (arg));
            powerUps.add(powerUp);
        }
    
}