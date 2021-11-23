private void onOK(IO.Communicator c) {
    c.setSchmutzi_library_type(((java.lang.String) (this.schmutzi_library_combobox.getModel().getSelectedItem())).toLowerCase());
    dispose();
}