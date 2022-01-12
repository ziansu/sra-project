boolean readOnOff(int zb, int s) throws rs232.rs232Exception {
    rs232.log.entry(zb, s);
    if (!(cfg.test))
        return rs232.log.exit(readZB(zb, s));
    else
        return r.nextBoolean();
    
}