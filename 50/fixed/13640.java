public java.lang.String getHarvestTool(int metadata) {
    tterrag.customthings.common.config.json.BlockType type = getType(metadata);
    return type.toolType.isEmpty() ? null : type.toolType;
}