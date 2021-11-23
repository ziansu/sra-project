public void setDesignedRouter(byte[] router) throws java.lang.Exception {
    if ((router.length) != 4) {
        throw new java.lang.Exception("designed router length error!");
    }
    for (int i = 0; i < 4; i++) {
        designed_router[i] = router[i];
    }
}