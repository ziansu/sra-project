@java.lang.Override
public Response recieveRequestFrom(Philosopher philosopher, Request packet, boolean isLeft) {
    Chopstick chop = philosopher.getChopstick(isLeft);
    if ((chop != null) && (chop.isDirty())) {
        philosopher.setChopstick(null, isLeft);
        return new Response(chop);
    }else {
        return new Response(null);
    }
}