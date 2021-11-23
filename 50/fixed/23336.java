@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void messageShouldRequireNonEmptyKey() {
    new org.openlmis.referencedata.util.Message(" ");
}