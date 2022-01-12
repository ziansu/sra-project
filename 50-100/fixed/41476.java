@java.lang.Override
public void onImhereClick() {
    if (model.isCurrentSessionAlive()) {
        model.cancelCurrentSession();
    }else {
        try {
            model.openNewSession();
        } catch (com.parse.ParseException e) {
            e.printStackTrace();
            android.widget.Toast.makeText(this, ("Error logining to server: " + (e.getMessage())), Toast.LENGTH_SHORT).show();
        }
    }
}