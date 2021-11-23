@org.junit.Test
public void testColumnTranspotions() {
    java.lang.String plain = "WHICH WRIST WATCH ESARE SWISS WRIST WATCH ESXXX";
    java.lang.String cipher = "HTHES THXHR ASWRA SCSCR SSCXW WWESW WEIIT AIITX";
    org.junit.Assert.assertEquals("encrypt by array", cipher, ColumnTransposition.encrypt(plain, new java.lang.Integer[]{ 4 , 2 , 5 , 3 , 1 }));
    org.junit.Assert.assertEquals("preshared keyword", cipher, ColumnTransposition.encrypt(plain, "dbECA"));
    org.junit.Assert.assertEquals("decrypt by array", plain, ColumnTransposition.decrypt(cipher, new java.lang.Integer[]{ 4 , 2 , 5 , 3 , 1 }));
}