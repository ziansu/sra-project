public void updateAppTrainingsData(java.util.ArrayList<zina_eliran.app.BusinessEntities.BEBaseEntity> entities) {
    setMyJoinedTrainingsList(filterMyTrainings(getAppUser().getId(), entities, false));
    setMyCreatedTrainingsList(filterMyTrainings(getAppUser().getId(), entities, true));
    setPublicTrainingsList(filterPublicTrainings(getAppUser().getId(), entities));
}