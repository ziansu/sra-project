@java.lang.Override
public void setPlayerCreated(boolean playerCreated) {
    metadata.set(MetadataIndex.GOLEM_PLAYER_BUILT, (playerCreated ? ((byte) (1)) : ((byte) (0))));
}