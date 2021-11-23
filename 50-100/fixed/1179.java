public static swen.adventure.engine.datastorage.EventConnectionParser.EventConnection parseLine(java.lang.String line) {
    line = line.replaceAll("\\s+", "");
    java.lang.String[] components = line.split(";");
    java.lang.String eventName = components[0];
    java.lang.String actionName = components[2];
    java.util.List<java.lang.String> objectNames = swen.adventure.engine.datastorage.EventConnectionParser.parseList(components[1]);
    java.util.List<java.lang.String> listenerNames = swen.adventure.engine.datastorage.EventConnectionParser.parseList(components[3]);
    return new swen.adventure.engine.datastorage.EventConnectionParser.EventConnection(eventName, objectNames, actionName, listenerNames);
}