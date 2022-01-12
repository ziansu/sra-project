public void addBus(travelAgencyModel.Bus bus) {
    if ((client) != null) {
        java.util.HashMap<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>();
        parameters.put(CommandConstants.PARAM_BUS, bus);
        client.sendMessage(new travelAgencyNetwork.MessageCommands(travelAgencyNetwork.CommandConstants.ADD_BUS, parameters));
        busList.addBus(bus);
    }else {
        busList.addBus(bus);
    }
}