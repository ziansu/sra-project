public void postEvent(java.lang.Object event) {
    java.lang.String parameterTypeName = event.getClass().getCanonicalName();
    java.util.List<com.crush.bus.Bus.Bean> beenList = subscribers.get(parameterTypeName);
    if (null == beenList)
        return ;
    
    for (com.crush.bus.Bus.Bean b : beenList) {
        try {
            b.getM().invoke(b.getO(), event);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
            beenList.remove(b);
        }
    }
}