private void loadComments() throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
    java.io.ObjectInputStream in = new java.io.ObjectInputStream(openFileInput((((COMMENT_STORE) + "_") + (tourName))));
    while (true) {
        try {
            comments.add(((droid.ipm.other.TourComment) (in.readObject())));
        } catch (java.io.IOException e) {
            break;
        }
    } 
}