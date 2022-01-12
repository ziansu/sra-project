public void showMessage(java.lang.String message) {
    if (message.equals("")) {
        return ;
    }
    tfMainInput.setText("");
    my.edu.taylors.dad.chat.entity.Message newMessage = new my.edu.taylors.dad.chat.entity.Message(message, my.edu.taylors.dad.chat.entity.ClientType.ME);
    addMessage(newMessage);
    sendMessage(message);
}