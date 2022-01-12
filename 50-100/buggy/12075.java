public lampkicking.model.OutputData play(lampkicking.model.InputData inputData) {
    lampkicking.service.Hoover hoover = new lampkicking.service.Hoover(inputData);
    lampkicking.model.OutputData outputData = hoover.start();
    lampkicking.model.Game game = new lampkicking.model.Game();
    game.setInput(gson.toJson(inputData));
    game.setOutput(gson.toJson(outputData));
    gameRepository.save(game);
    return outputData;
}