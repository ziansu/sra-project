private void printGames(java.util.List<?> gameNames) {
    if ((gui) != null) {
        if (gameNames.isEmpty())
            gui.statusMessage("No available games.");
        else
            gui.refreshGameList(gameNames);
        
    }else {
        if (gameNames.isEmpty())
            java.lang.System.out.println("No available games.");
        else
            for (java.lang.Object gameName : gameNames)
                java.lang.System.out.println(((java.lang.String) (gameName)));
            
        
    }
}