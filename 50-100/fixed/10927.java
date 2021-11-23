@java.lang.Override
public void onResponse(retrofit2.Response<com.birdcopy.BirdCopyApp.Http.CallResultCode> response) {
    com.birdcopy.BirdCopyApp.Http.CallResultCode result = response.body();
    if ("1".equals(result.getRc())) {
        if ("-1".equalsIgnoreCase(result.getRs())) {
            if (delegate != null) {
                delegate.completion(false);
            }
        }else {
            if (delegate != null) {
                delegate.completion(true);
            }
        }
    }
}