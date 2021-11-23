private void showMessage(android.os.Bundle args) {
    com.edulectronics.tinycircuit.Views.Message dialogFragment = new com.edulectronics.tinycircuit.Views.Message();
    dialogFragment.setArguments(args);
    dialogFragment.show(fragmentManager, "");
}