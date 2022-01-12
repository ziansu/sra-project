private void parseIntent(android.content.Intent intent) {
    if (intent == null)
        return ;
    
    token = intent.getStringExtra(IntentTypeUtils.INTENT_KEY);
    user = intent.getStringExtra(IntentTypeUtils.USER_KEY);
    rooms = java.lang.Integer.parseInt(intent.getStringExtra(IntentTypeUtils.ROOM_NUM));
}