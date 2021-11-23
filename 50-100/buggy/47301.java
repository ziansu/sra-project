@java.lang.Override
public void onBlockUpdateEvent(konstructs.api.messages.BlockUpdateEvent event) {
    for (java.util.Map.Entry<org.konstructs.flowers.Position, org.konstructs.flowers.BlockUpdate> p : event.getUpdatedBlocks().entrySet()) {
        if ((p.getValue().getAfter().equals(growsOn)) && ((random.nextInt(1000)) <= (randomGrowth))) {
            tryToSeed(p.getKey());
        }
    }
}