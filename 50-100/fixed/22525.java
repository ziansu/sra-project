public static void main(java.lang.String[] args) throws java.lang.Exception {
    try {
        java.lang.String fileName = "C:/Users/opanahi/Desktop/BPMN2.0 project/justRec.vsdx";
        java.lang.String fileName1 = "C:/Users/opanahi/Desktop/BPMN2.0 project/exampleofBPMN2.vsdx";
        java.lang.String fileName2 = "C:/Users/opanahi/Desktop/BPMN2.0 project/start_Task.vsdx";
        XmlVisioDocument xmlViso = new XmlVisioDocument(org.apache.poi.openxml4j.opc.OPCPackage.open(new java.io.FileInputStream(fileName2)));
        VSdxToString.getShapeName(xmlViso);
    } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}