public void setDesignedRouter(byte[] router) {
    if ((router.length) != 4) {
        java.lang.System.out.println("designed router length error!");
        return ;
    }
    for (int i = 0; i < 4; i++) {
        designed_router[i] = router[i];
    }
}