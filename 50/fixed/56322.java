private boolean isDefaultSubsystem(hu.bme.mit.massif.simulink.Block block) {
    java.lang.String realSourceBlockFQN = getRealSourceBlockFQN(block);
    return ("simulink/Ports & Subsystems/Subsystem".equalsIgnoreCase(realSourceBlockFQN)) || ("simulink/Ports & Subsystems/Atomic Subsystem".equalsIgnoreCase(realSourceBlockFQN));
}