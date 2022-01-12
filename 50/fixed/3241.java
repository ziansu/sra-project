public synchronized <S> void addService(S object) {
    instanciedServices.put(object.getClass(), object);
}