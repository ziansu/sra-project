public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException, jsettlers.common.map.MapLoadException {
    java.util.HashMap<java.lang.String, java.lang.String> argsMap = jsettlers.common.utils.MainUtils.createArgumentsMap(args);
    jsettlers.main.swing.SwingManagedJSettlers.loadDebugSettings(argsMap);
    jsettlers.main.swing.SwingManagedJSettlers.setupResourceManagers(argsMap, "config.prp");
    jsettlers.graphics.JSettlersScreen content = jsettlers.main.swing.SwingManagedJSettlers.startGui();
    jsettlers.main.swing.SwingManagedJSettlers.generateContent(argsMap, content);
    javafx.application.Application.launch(args);
}