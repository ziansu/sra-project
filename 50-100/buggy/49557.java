public void finishAllActivityExcept(java.lang.Class<?> cls) {
    for (int i = 0, size = activityStack.size(); i < size; i++) {
        if ((null != (activityStack.get(i))) && (!(activityStack.get(i).getClass().equals(cls)))) {
            finishActivity(activityStack.get(i));
            break;
        }
    }
    activityStack.clear();
}