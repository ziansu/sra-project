public void addSymbolToMessage(android.graphics.drawable.Drawable message) {
    currentMessageArray.add(message);
    if ((chatArray.size()) != 0) {
        chatArray.remove(((chatArray.size()) - 1));
    }
    java.util.ArrayList<android.graphics.drawable.Drawable> tempArr = ((java.util.ArrayList<android.graphics.drawable.Drawable>) (currentMessageArray.clone()));
    chatArray.add(tempArr);
}