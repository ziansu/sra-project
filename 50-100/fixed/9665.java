public void Initialize(com.traintrax.navigation.service.mdu.MotionDetectionUnitInterface motionDetectionUnit, com.traintrax.navigation.service.TrackSwitchControllerInterface trackSwitchController, com.traintrax.navigation.service.TrainNavigationDatabaseInterface trainNavigationDatabase, com.traintrax.navigation.service.events.PublisherInterface<com.traintrax.navigation.service.TrainNavigationServiceEventSubscriber, com.traintrax.navigation.service.TrainNavigationServiceEvent> eventPublisher, com.traintrax.navigation.service.position.InertialMotionPositionAlgorithmInterface trainPositionAlgorithm, boolean useRfidTagsOnly) {
    this.motionDetectionUnit = motionDetectionUnit;
    this.trackSwitchController = trackSwitchController;
    this.eventPublisher = eventPublisher;
    this.trainNavigationDatabase = trainNavigationDatabase;
    this.positionAlgorithm = trainPositionAlgorithm;
    this.useRfidTagsOnly = useRfidTagsOnly;
    this.timer = new java.util.Timer();
    this.motionDetectionUnit.setMduCallback(this);
    setupTimer();
}