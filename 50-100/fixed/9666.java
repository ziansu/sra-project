public void actionEvent() {
    if ((tfInput.getText().length()) > 0) {
        if ((controller.getSelectedUsers()) != null) {
            java.lang.String[] recipients = controller.getSelectedUsers();
            controller.send(new chat_client.Message(tfInput.getText(), recipients));
        }else {
            controller.send(new chat_client.Message(tfInput.getText(), true));
        }
        tfInput.setText("");
    }
}