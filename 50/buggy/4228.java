@java.lang.Override
public void onFailure(com.google.web.bindery.requestfactory.shared.ServerFailure error) {
    com.google.gwt.user.client.Window.alert(error.getMessage());
}