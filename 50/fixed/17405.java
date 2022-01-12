public void add(com.skilltradiez.skilltraderz.Notification newNote) {
    if (newNote == null)
        return ;
    
    if (lock)
        newNotifications.add(newNote);
    else
        notifications.add(newNote);
    
}