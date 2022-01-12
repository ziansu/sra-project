public void changePositionValue(es.mikel.tictactoe.Vector2 position) {
    java.util.Arrays.asList(positions).get(java.util.Arrays.asList(positions).indexOf(position)).setX(position.getX());
    java.util.Arrays.asList(positions).get(java.util.Arrays.asList(positions).indexOf(position)).setY(position.getY());
    java.util.Arrays.asList(positions).get(java.util.Arrays.asList(positions).indexOf(position)).setValue(position.getValue());
}