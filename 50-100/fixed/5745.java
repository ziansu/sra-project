protected java.lang.Thread newLockThread(com.coreos.jetcd.concurrency.Mutex m, boolean toBeCancelled) {
    return new java.lang.Thread(() -> {
        try {
            boolean result = m.lock();
            test.assertEquals(result, (!toBeCancelled));
        } catch (com.coreos.jetcd.exception.EtcdException e) {
            java.lang.System.out.println(e.getMessage());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    });
}