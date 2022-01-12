@java.lang.Override
public void run() {
    try {
        com.selab.model.Entity.NativeAd nativeAd = this.getNativeAd();
        java.lang.Long adId = null;
        try {
            adId = this.saveAd(nativeAd);
        } catch (com.selab.model.exception.AssetErrorException e) {
            e.printStackTrace();
        }
        this.saveUrl(nativeAd.getNative(), adId);
    } catch (org.springframework.web.client.HttpServerErrorException e) {
        java.lang.System.out.println(e.getStatusCode());
    }
}