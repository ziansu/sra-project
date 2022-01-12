boolean readOnOff(int zb, int s) throws rs232.rs232Exception {
    rs232.log.entry(zb, s);
    if (!(cfg.test)) {
        if (zb >= 0)
            return rs232.log.exit(readZB(zb, s));
        else
            return false;
        
    }else
        return r.nextBoolean();
    
}