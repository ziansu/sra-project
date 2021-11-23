@org.testng.annotations.DataProvider
public java.lang.Object[][] badArgs() {
    return new java.lang.Object[][]{ new java.lang.Object[]{ null , null } , new java.lang.Object[]{ 0 , null } , new java.lang.Object[]{ null , java.lang.Integer.MAX_VALUE } , new java.lang.Object[]{ 0 , java.lang.Integer.MAX_VALUE } , new java.lang.Object[]{ null , -1 } , new java.lang.Object[]{ -1 , null } };
}