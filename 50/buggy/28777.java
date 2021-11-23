public static void main(final java.lang.String[] args) {
    final java.lang.String bdvFile = "samples/datasethdf5.xml";
    final java.lang.String modelFile = "samples/model_revised.raw";
    final int initialTimepointIndex = 10;
    final net.trackmate.revised.MaMuTGUI window = new net.trackmate.revised.MaMuTGUI(bdvFile, modelFile, initialTimepointIndex);
}