@java.lang.Override
public void in(com.myselia.javacommon.communication.units.Transmission trans) {
    java.lang.System.out.println(("GOT FOR STEM: " + trans));
    com.myselia.javadaemon.StemEndpoint.cc.in(trans);
}