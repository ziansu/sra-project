private static void clearAndCancelCallback(com.github.kubatatami.judonetworking.stateful.Stateful stateful) {
    stateful.tryCancel();
    stateful.setCallback(null);
}