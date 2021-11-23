public void waitToFinish() {
    flush();
    futures.forEach(( f) -> {
        try {
            f.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            printError("Error while waiting for termination", e);
        }
    });
    futures.clear();
    java.lang.System.out.println("All tasks completed");
}