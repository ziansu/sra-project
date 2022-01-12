@java.lang.Override
public byte[] getPrintData() {
    messageData = new byte[translator.getPCLSize()];
    resetPrinter();
    addUnitOfMeasure();
    addPageSize();
    addESC();
    addText("*p0P");
    addPosition();
    addConfigureImageData();
    addDotsPerInch();
    addImageFile();
    addESC();
    addText("*rC");
    addESC();
    addText("*p1P");
    resetPrinter();
    return messageData;
}