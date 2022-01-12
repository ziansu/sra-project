private static void save(ws.model.Greeting greeting) {
    if ((ws.api.GreetingController.nextId) == null)
        ws.api.GreetingController.nextId = java.math.BigInteger.ONE;
    else
        ws.api.GreetingController.nextId = ws.api.GreetingController.nextId.add(java.math.BigInteger.ONE);
    
    greeting.setId(ws.api.GreetingController.nextId);
    ws.api.GreetingController.greetingMap.put(greeting.getId(), greeting);
}