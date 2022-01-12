private void registerHandlers() {
    eventBus.register(new babysnoozer.LogHandler());
    eventBus.register(new babysnoozer.DisplayHandler(babysnoozer.tinkerforge.TinkerforgeSystem.TinkerforgeSystem.getDisplay4x7()));
    eventBus.register(new babysnoozer.AnlernStateMachine());
    eventBus.register(new babysnoozer.ServoHandler());
    eventBus.register(new babysnoozer.SnoozingBabyHandler());
    eventBus.register(new babysnoozer.SnoozeCycleStateHandler());
}