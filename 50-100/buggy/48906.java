public static void applyOverrides() {
    CCubesCore.logger.info("Applying Non-Replaceable Block overrides");
    for (chanceCubes.util.NonReplaceableBlockOverride override : chanceCubes.config.CCubesSettings.nonReplaceableBlockOverrides) {
        if (override.overrideType) {
            CCubesSettings.nonReplaceableBlocks.add(override.overriddenBlock);
        }else {
            if (CCubesSettings.nonReplaceableBlocks.contains(override.overriddenBlock)) {
                CCubesSettings.nonReplaceableBlocks.remove(override.overriddenBlock);
            }
        }
    }
}