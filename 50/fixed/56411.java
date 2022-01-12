public void setPowerState(final rst.domotic.state.PowerStateType.PowerState.State state) throws org.openbase.jul.exception.CouldNotPerformException {
    this.setPowerState(rst.domotic.state.PowerStateType.PowerState.newBuilder().setValue(state).build());
}