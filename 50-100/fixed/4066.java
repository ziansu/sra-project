@java.lang.Override
public void changed(javafx.beans.value.ObservableValue ov, javafx.concurrent.Worker.State oldState, javafx.concurrent.Worker.State newState) {
    if (newState == (javafx.concurrent.Worker.State.SUCCEEDED)) {
        if (webEngine.getLocation().contains("web_access_point=")) {
            stage.close();
            com.crehop.sign.test.AuthorizationUtils.setAuthorizationData(webEngine.getLocation());
            com.crehop.sign.test.DocumentHandler.sendForSignature("E:/AdobeSignJavaSdk-master/rest-api-sample/bin/lease.pdf");
        }
    }
}