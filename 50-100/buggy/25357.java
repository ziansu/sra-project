public void sendLabels() {
    try {
        this.out.write((((mainActivity.robotNum) + ":") + (mainActivity.getData()[1])).getBytes(java.nio.charset.Charset.forName("UTF-8")));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}