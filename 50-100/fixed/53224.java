public void addSessionIfNeededAddDay(com.twiw.trackman.Context ctx) {
    ctx.setSession(ctx.getSessionFactory().create());
    if (((ctx.getTrack()) == null) || ((ctx.getTrack().getSessionCount()) == (ctx.maxSessionPerTrack))) {
        this.addTrack(ctx);
    }
    ctx.getTrack().add(ctx.getSession());
}