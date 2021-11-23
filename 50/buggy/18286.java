private void startSimulation(com.feheren_fekete.espresso.InputValues inputValues) {
    com.feheren_fekete.espresso.SimulationParameters simulationParameters = new com.feheren_fekete.espresso.SimulationParameters(InputValues);
    android.content.Intent simulationActivityIntent = new android.content.Intent(this, com.feheren_fekete.espresso.SimulationActivity.class);
    simulationActivityIntent.putExtra(Common.SIMULATION_PARAMETERS, simulationParameters);
    startActivity(simulationActivityIntent);
}