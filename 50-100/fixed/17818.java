public void exportList(java.lang.String fileName) {
    try (java.io.FileOutputStream fos = new java.io.FileOutputStream(fileName);java.io.PrintWriter writer = new java.io.PrintWriter(fos)) {
        for (com.teamtreehouse.jargame.User user : userList) {
            writer.printf("%s|%d%n", user.getName(), user.getHighScore());
        }
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
    }
}