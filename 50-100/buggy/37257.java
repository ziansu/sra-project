public void onEvent(com.avoscloud.chat.event.MemberLetterEvent event) {
    java.lang.Character targetChar = java.lang.Character.toLowerCase(event.letter);
    if (itemAdapter.getIndexMap().containsKey(targetChar)) {
        int index = itemAdapter.getIndexMap().get(targetChar);
        if ((index > 0) && (index < (itemAdapter.getItemCount()))) {
            layoutManager.scrollToPositionWithOffset(index, 0);
        }
    }
}