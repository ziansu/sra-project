static co.paralleluniverse.comsat.webactors.Cookie getNettyCookie(co.paralleluniverse.comsat.webactors.Cookie c) {
    co.paralleluniverse.comsat.webactors.Cookie ret = new co.paralleluniverse.comsat.webactors.netty.DefaultCookie(c.getName(), c.getValue());
    ret.setDomain(c.getDomain());
    ret.setHttpOnly(c.isHttpOnly());
    ret.setMaxAge(c.getMaxAge());
    ret.setPath(c.getPath());
    ret.setSecure(c.isSecure());
    return ret;
}