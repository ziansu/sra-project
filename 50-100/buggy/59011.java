@java.lang.Override
public void event(java.lang.String message) {
    switch (message) {
        case "Pick Game" :
            this.isPicking = MainClass.client.readBool();
            this.manager.wonLastGame = this.isPicking;
            showGameChoosing = true;
            break;
        case "Game Chosen" :
            manager.gameName = MainClass.client.readString();
            break;
    }
}