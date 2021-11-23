public void firstPresident() {
    int length = client.getLength("data/Players.txt");
    client.close();
    java.lang.String[] scores = new java.lang.String[length];
    scores = client.readFile("data/Players.txt");
    java.lang.String firstPres = scores[3];
    client.openToWrite("data/Turn.txt");
    client.writeToFile("#name of the President");
    client.writeToFile(firstPres);
    client.writeToFile("#name of the Chancellor");
    client.writeToFile("b");
    client.close();
}