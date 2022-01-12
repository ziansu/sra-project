public travelAgencyModel.Chauffeur[] getAllChauffeurs() {
    if ((client) != null) {
        travelAgencyModel.Chauffeur[] chauffeursList = ((travelAgencyModel.Chauffeur[]) (client.sendMessage(new travelAgencyNetwork.MessageCommands(travelAgencyNetwork.CommandConstants.GET_ALL_CHAUFFEURS, null))));
        return chauffeursList;
    }else {
        return chauffeurList.getAllChauffeurs();
    }
}