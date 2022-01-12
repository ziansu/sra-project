@java.lang.Override
@org.testng.annotations.BeforeClass(alwaysRun = true)
public void beforeClass() {
    super.beforeClass();
    try {
        hla.rti1516e.RtiFactory rtiFactory = hla.rti1516e.RtiFactoryFactory.getRtiFactory();
        this.encoderFactory = rtiFactory.getEncoderFactory();
    } catch (hla.rti1516e.exceptions.RTIinternalError rtiie) {
        super.unexpectedException("Creating an EncoderFactory", rtiie);
    }
    this.encoderFactory = new org.portico.impl.hla1516e.types.encoding.HLA1516eEncoderFactory();
}