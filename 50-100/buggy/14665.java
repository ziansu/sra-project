@java.lang.Override
public void execute(final io.keepcoding.madridguide.interactors.GetAllShopsInteractorResponse response) {
    java.util.List<io.keepcoding.madridguide.model.Shop> data = getShops();
    final io.keepcoding.madridguide.model.Shops sut = io.keepcoding.madridguide.model.Shops.build(data);
    try {
        java.lang.Thread.currentThread().sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    io.keepcoding.madridguide.util.MainThread.run(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            response.response(sut);
        }
    });
}