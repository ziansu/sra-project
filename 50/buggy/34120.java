public java.lang.String nextString() {
    for (int idx = 0; idx < (buf.length); ++idx)
        buf[idx] = org.juneja.eventdemo.utils.RandomString.symbols[random.nextInt(org.juneja.eventdemo.utils.RandomString.symbols.length)];
    
    return new java.lang.String(buf);
}