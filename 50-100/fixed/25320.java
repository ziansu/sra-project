private void fillMiniStack(org.apache.axis2.json.gson.factory.JsonObject nestedJsonObject) {
    while (!((processedJsonObjects.peek().getName().equals(nestedJsonObject.getName())) && (processedJsonObjects.peek().getType().name().equals(nestedJsonObject.getType().name())))) {
        miniStack.push(processedJsonObjects.pop());
    } 
    processedJsonObjects.pop();
}