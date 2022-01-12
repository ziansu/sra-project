public void start() {
    java.util.ArrayList<View> views = readFile("unge-lovende.csv");
    java.util.HashMap[] viewData = findKeyData(views);
    Analyse.printMap(viewData[0]);
    Analyse.printMap(viewData[1]);
    Analyse.printDayMap(viewData[2]);
    Analyse.printMap(viewData[3]);
}