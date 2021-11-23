@java.lang.Override
public void saveMissionItinerary(com.sopra.entity.Mission missions) {
    missionRepository.save(missions);
}