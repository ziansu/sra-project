@java.lang.Override
public void run() {
    com.softtanck.findprinter.bean.Printer printer = null;
    if ((sendPacket(ip)) && (isContain(ip))) {
        printer = new com.softtanck.findprinter.bean.Printer();
        printer.ip = ip;
        printer.mac = mac;
    }
    sendMsg(printer);
}