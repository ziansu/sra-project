@java.lang.Override
public void run() {
    try {
        com.selab.model.Entity.NativeAd nativeAd = this.getNativeAd();
        if ((nativeAd.getNative()) != null) {
            java.lang.Long adId = this.saveAd(nativeAd);
            this.saveUrl(nativeAd.getNative(), adId);
        }
    } catch (com.selab.model.exception.AssetErrorException e) {
        e.printStackTrace();
    } catch (org.springframework.web.client.HttpServerErrorException e) {
        java.lang.System.out.println(e.getStatusCode());
    }
}