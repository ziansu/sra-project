private static void clearAndCancelCallback(com.github.kubatatami.judonetworking.stateful.Stateful stateful) {
    stateful.setCallback(null);
    stateful.tryCancel();
}