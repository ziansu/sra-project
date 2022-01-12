public void addSymbolToMessage(android.graphics.drawable.Drawable message) {
    currentMessageArray.add(message);
    if ((chatArray.size()) != 0) {
        chatArray.remove(((chatArray.size()) - 1));
    }
    chatArray.add(((java.util.ArrayList<android.graphics.drawable.Drawable>) (currentMessageArray.clone())));
}