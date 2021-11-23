private void printL() {
    for (Light l : listOfLights) {
        java.lang.System.out.println((((l.getPosition().getCol()) + "             ") + (l.getPosition().getRow())));
    }
}