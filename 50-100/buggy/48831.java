private void handleFinish(java.lang.String input, com.ethteck.dungeonescape.core.DungeonEscape game, com.ethteck.dungeonescape.state.StateContext SC) {
    com.ethteck.dungeonescape.input.Response answer = com.ethteck.dungeonescape.string.Parser.getAnswer(input);
    if (answer == (com.ethteck.dungeonescape.input.Response.NO)) {
        outputResponse = "Well then you may either EXIT or give me a YES.";
    }else
        if (answer == (com.ethteck.dungeonescape.input.Response.YES)) {
            outputResponse = "Let's begin";
            outputResponses(game, false);
            exit(game, SC);
            return ;
        }else {
            outputResponse = com.ethteck.dungeonescape.data.JSONManager.getStrings().invalidResponse;
        }
    
}