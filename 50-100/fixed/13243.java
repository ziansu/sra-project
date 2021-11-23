@java.lang.Override
public void process(java.lang.String data, net.lastman.network.core.TCPClient TCPcn) {
    java.lang.String[] dat = data.split(":");
    byte buffCode = dat[0].getBytes()[0];
    java.lang.String name = dat[1];
    if (dat[2].contains("|"))
        com.lms.buff.CoreBuff.processBuff(buffCode, name, dat[2].split("|"));
    else
        com.lms.buff.CoreBuff.processBuff(buffCode, name, new java.lang.String[]{ dat[2] });
    
}