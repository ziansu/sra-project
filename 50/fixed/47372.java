public void cleanup() {
    if ((this.rctx) == null) {
    }else {
        rctx.destroy();
    }
}