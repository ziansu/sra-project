@java.lang.Override
public java.lang.Double call(com.jt.commons.GenericRecord rec1, com.jt.commons.GenericRecord rec2) throws java.lang.Exception {
    java.lang.Double avg = (((java.lang.Double) (rec1.get(Constants.CLOSE))) + ((java.lang.Double) (rec2.get(Constants.CLOSE)))) / 2;
    return avg;
}