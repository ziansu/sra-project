private void StopWriteFile() {
    try {
        motion_writer.flush();
        motion_writer.close();
    } catch (java.lang.Exception e) {
    }
}