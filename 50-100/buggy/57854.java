@java.lang.Override
public void addNotification(java.lang.String recipeId, java.lang.String recipeTitle, java.lang.String from, java.lang.String to, java.lang.String notiType) {
    if (from.equals(to)) {
        return ;
    }
    synchronized(queue) {
        org.entity.Notification noti = new org.entity.Notification();
        noti.setFrom(from);
        noti.setTo(to);
        noti.setRecipeId(recipeId);
        noti.setRecipeTitle(recipeTitle);
        noti.setType(notiType);
        queue.add(noti);
        queue.notify();
    }
}