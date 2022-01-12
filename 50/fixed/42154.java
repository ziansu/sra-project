private void showMessage(android.os.Bundle args) {
    com.edulectronics.tinycircuit.Views.Message message = new com.edulectronics.tinycircuit.Views.Message();
    message.setArguments(args);
    message.show(fragmentManager, "");
}