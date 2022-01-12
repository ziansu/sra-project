@java.lang.Override
public void process(java.lang.String data, net.lastman.network.core.TCPClient TCPcn) {
    java.lang.String[] dat = data.split(":");
    byte buffCode = dat[0].getBytes()[0];
    java.lang.String name = dat[1];
    java.lang.System.out.println(data);
    com.lms.buff.CoreBuff.processBuff(buffCode, name, dat[2].split("|"));
}