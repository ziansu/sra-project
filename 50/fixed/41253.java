@org.junit.Test(expected = java.lang.NullPointerException.class)
public void messageShouldRequireNonNullKey() {
    new org.openlmis.referencedata.util.Message(null);
}