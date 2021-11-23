private void lookAtItem(java.lang.String item) {
    if (item.contains("look at"))
        item = item.replace("look at", "");
    
    item = item.trim();
    currentRoom.lookAt(item);
}