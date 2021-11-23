private boolean isDefaultSubsystem(hu.bme.mit.massif.simulink.Block block) {
    java.lang.String realSourceBlockFQN = getRealSourceBlockFQN(block);
    return (realSourceBlockFQN.equalsIgnoreCase("simulink/Ports & Subsystems/Subsystem")) || (realSourceBlockFQN.equalsIgnoreCase("simulink/Ports & Subsystems/Atomic Subsystem"));
}