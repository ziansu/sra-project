@java.lang.Override
public void event(java.lang.String message) {
    switch (message) {
        case "Pick Game" :
            if ((isPicking) == false) {
                showGameChoosing = true;
            }
            isPicking = manager.wonLastGame;
            break;
        case "Game Chosen" :
            manager.gameName = MainClass.client.readString();
            break;
    }
}