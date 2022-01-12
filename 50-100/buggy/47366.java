@java.lang.Override
public void startEffect() {
    oldBehaviours = new java.util.HashMap<>();
    for (com.github.fishio.Entity e : getPField().getEntities()) {
        if (e instanceof com.github.fishio.EnemyFish) {
            com.github.fishio.EnemyFish fish = ((com.github.fishio.EnemyFish) (e));
            oldBehaviours.put(fish, fish.getBehaviour());
            fish.setBehaviour(new com.github.fishio.behaviours.FrozenBehaviour());
        }
    }
}