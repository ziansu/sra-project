protected void finalize() throws java.lang.Throwable {
    friend.depth = 0;
    friend.writeline("Task is complete");
    super.finalize();
}