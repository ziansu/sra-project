static void setNextPostID(int next) {
    try (java.io.FileWriter fw = new java.io.FileWriter("/tmp/fetchd/postID", false)) {
        fw.write(next);
    } catch (java.io.IOException e) {
    }
}