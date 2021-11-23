public void addingFollowingAccountsToFile(java.util.ArrayList list) throws java.io.IOException {
    java.io.File file = new java.io.File("myfollowing.txt");
    if (!(file.exists())) {
        writer = new java.io.PrintWriter("myfollowing.txt");
    }else {
        writer = new java.io.PrintWriter(new java.io.FileOutputStream(new java.io.File("123.txt"), true));
    }
    addinglist(list);
    writer.close();
}