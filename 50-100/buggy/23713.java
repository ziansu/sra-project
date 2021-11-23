@java.lang.Override
public void entitySightNotice(com.esbjon.mapobjects.VicinityReference sightedEntity) {
    if ((sightedEntity instanceof com.esbjon.entities.Substance) && ((watchObject) == null)) {
        if ((((com.esbjon.entities.Substance) (sightedEntity)).getWatch()) == null) {
            watchObject = ((com.esbjon.entities.Substance) (sightedEntity));
            watchObject.setWatch(this);
        }
    }else
        if (sightedEntity instanceof com.esbjon.entities.Shuttle) {
            java.lang.System.out.println("Wolf caught sight of shuttle");
        }
    
}