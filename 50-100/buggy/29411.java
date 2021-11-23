public static void Configure() {
    Main.Config.WindowMinWidth = 800;
    Main.Config.WindowMinHeight = 600;
    Main.Config.Commands = new com.somethingyellow.magnets.Main.Commands() {
        @java.lang.Override
        public com.somethingyellow.graphics.InterfaceStage newInterfaceStage() {
            return new com.somethingyellow.graphics.DesktopInterfaceStage();
        }
    };
    PlayScreenUIStage.Config.IfHacksActive = true;
    DataManager.Config.UserDataFilePath = "user.data";
    LightingShaderGenerator.Config.AmbientColorBlueDefault = 0.55F;
    LightingShaderGenerator.Config.AmbientColorGreenDefault = 0.55F;
    LightingShaderGenerator.Config.AmbientColorRedDefault = 0.55F;
}