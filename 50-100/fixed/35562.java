@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<?> observable, java.lang.Object oldValue, java.lang.Object newValue) {
    application.View.currImage = new javafx.scene.image.Image(application.View.m.Pictures.get(0));
    application.View.me.pics.setImage(application.View.currImage);
    application.View.center();
    application.View.m.Pictures.remove(0);
}