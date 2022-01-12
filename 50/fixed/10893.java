private void sendFailForAll() {
    for (int id = 0; id < (Simulation.NumberOfAgents); id++) {
        sendMessage(new Messages.KillMessage(), id);
    }
}