private java.util.ArrayList<org.Point> finalLocs() {
    java.util.ArrayList<org.Point> ret = new java.util.ArrayList<>();
    for (javafx.scene.control.ChoiceBox cb : locations) {
        if ((cb.getValue()) != null) {
            addtoFinalLocs(ret, cb);
        }
    }
    return ret;
}