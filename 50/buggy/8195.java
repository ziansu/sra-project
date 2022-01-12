private void signalNextManeuver() {
    bl_handler.send(((directions.get(1).BlueToothCode) + ""));
}