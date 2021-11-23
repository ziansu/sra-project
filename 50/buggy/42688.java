public static void loadResources() {
    if (!(com.builtbroken.mc.client.SharedAssets.loaded)) {
        com.builtbroken.mc.client.SharedAssets.loaded = true;
        com.builtbroken.mc.client.SharedAssets.TOOL_TABLE = com.builtbroken.mc.client.SharedAssets.model("tool-table.obj");
        com.builtbroken.mc.client.SharedAssets.TOOL_TABLE_TEXTURE = com.builtbroken.mc.client.SharedAssets.texture("tool-table");
    }
}