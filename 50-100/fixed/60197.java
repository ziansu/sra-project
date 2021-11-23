@org.terasology.logic.console.commandSystem.annotations.Command(shortDescription = "Remove highlights marker", requiredPermission = org.terasology.logic.permission.PermissionManager.NO_PERMISSION)
public java.lang.String removeHighlight() {
    java.lang.String message = "There is no marker to remove";
    console.addMessage("Removing Highlight marker");
    if ((lastHighlightBlock) != null) {
        org.terasology.world.WorldProvider world = org.terasology.registry.CoreRegistry.get(org.terasology.world.WorldProvider.class);
        world.setBlock(lastHighlightPos, org.terasology.world.block.BlockManager.getAir());
        message = "Marker removed";
        lastHighlightBlock = null;
        lastHighlightPos = null;
    }
    return message;
}