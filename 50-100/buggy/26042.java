public void run() throws java.lang.Exception {
    while (true) {
        java.lang.String message = in.readLine();
        if (message.startsWith("TEAM")) {
            if (message.equals("TEAM1"))
                yourTeam = main.Game.Team.TEAM1;
            else
                yourTeam = main.Game.Team.TEAM2;
            
        }else
            if (message.startsWith("START")) {
                return ;
            }
        
    } 
}