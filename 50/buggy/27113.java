@java.lang.Override
public void saveMissionItinerary(com.sopra.entity.Mission missions) {
    for (com.sopra.entity.Itinerary it : missions.getItineraries()) {
        if (it != null) {
            it.setMission(missions);
        }
    }
    missionRepository.save(missions);
}