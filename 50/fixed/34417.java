public static void removeMethod(int index) {
    synchronized(Main.Ticker.managedMethods) {
        Main.Ticker.managedMethods.remove(index);
    }
}