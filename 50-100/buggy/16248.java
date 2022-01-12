public void removeTravel(travelAgencyModel.Travel travel) {
    if ((client) != null) {
        java.util.HashMap<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>();
        parameters.put(CommandConstants.PARAM_TRAVEL, travel);
        client.sendMessage(new travelAgencyNetwork.MessageCommands(travelAgencyNetwork.CommandConstants.REMOVE_TRAVEL, parameters));
    }else {
        travelsList.deleteTravel(travel);
        saveFileTravelsList();
    }
}