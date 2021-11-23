@org.junit.Test
public void separateIntFirstSmaller() {
    org.mellowtech.core.bytestorable.CBInt str1 = new org.mellowtech.core.bytestorable.CBInt(1);
    org.mellowtech.core.bytestorable.CBInt str2 = new org.mellowtech.core.bytestorable.CBInt(2);
    junit.framework.Assert.assertEquals(1, org.mellowtech.core.bytestorable.CBUtil.separate(str1, str2).value());
}