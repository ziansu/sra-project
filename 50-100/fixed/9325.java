@java.lang.Override
public void run() {
    java.lang.String s = "";
    for (int i = 0; i < (remoteWines.size()); i++) {
        s = (s + (remoteWines.get(i).toString())) + "\n";
    }
}