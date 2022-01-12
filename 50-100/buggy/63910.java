private void createPoseCommunicator() {
    us.ihmc.sensorProcessing.sensorData.JointConfigurationGatherer jointConfigurationGathererAndProducer = new us.ihmc.sensorProcessing.sensorData.JointConfigurationGatherer(fullRobotModel.get());
    us.ihmc.util.PeriodicThreadScheduler scheduler = new us.ihmc.util.PeriodicNonRealtimeThreadScheduler("PoseCommunicator");
    if (useNetworking.get()) {
        poseCommunicator = new us.ihmc.sensorProcessing.communication.producers.DRCPoseCommunicator(fullRobotModel.get(), jointConfigurationGathererAndProducer, null, globalDataProducer, timestampProvider.get(), sensorReader.getSensorRawOutputMapReadOnly(), controllerManager.getMotionStatusHolder(), null, scheduler, netClassList.get());
    }else {
        poseCommunicator = null;
    }
}