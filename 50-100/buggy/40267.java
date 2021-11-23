public Mapviewer.TiledMapReader.JsonClasses.TileObject giveActualEventDestination() {
    int eventPopulairityTotal = 0;
    for (NewAI.AILogic.Event event : _currentOngoingEvents) {
        eventPopulairityTotal += event.getPopularity();
        if ((eventPopulairityTotal - (_populairityCounter)) < 0) {
            if ((_totalEventPopulairity) != 0)
                _populairityCounter = ((_populairityCounter)++) % (_totalEventPopulairity);
            else
                java.lang.System.out.println("weird given actualeventdestination in AILogicRunner is ergens waar ik hem niet verwacht had");
            
            return _podia.get(((event.getPodium()) - 1));
        }
    }
    return null;
}