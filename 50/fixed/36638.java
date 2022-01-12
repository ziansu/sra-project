public void stopNet() {
    if (isStart) {
        try {
            ois.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    isStart = false;
}