@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<?> observable, java.lang.Object oldValue, java.lang.Object newValue) {
    java.lang.String t = application.View.m.Text_out.get(0);
    if (t != null) {
        application.View.me.out.appendText((t + "\n"));
    }
    application.View.m.Text_out.remove(0);
}