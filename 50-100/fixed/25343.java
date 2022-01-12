public travelAgencyModel.Chauffeur[] getAllChauffeurs() {
    if ((client) != null) {
        return ((travelAgencyModel.Chauffeur[]) (client.sendMessage(new travelAgencyNetwork.MessageCommands(travelAgencyNetwork.CommandConstants.GET_ALL_CHAUFFEURS, null))));
    }else {
        return chauffeurList.getAllChauffeurs();
    }
}