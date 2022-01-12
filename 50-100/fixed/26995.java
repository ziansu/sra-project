public boolean hasTrains() {
    java.util.LinkedList<Common.Wagon>[] tracks = getTracks();
    {
        if (tracks != null) {
            for (int i = 0; i < (tracks.length); i++) {
                if ((tracks[i]) != null) {
                    return true;
                }
            }
        }
    }
    return false;
}