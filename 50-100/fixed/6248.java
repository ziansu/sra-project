@org.testng.annotations.DataProvider
public java.lang.Object[][] badArgs() {
    return new java.lang.Object[][]{ new java.lang.Object[]{ null , null } , new java.lang.Object[]{ 0 , null } , new java.lang.Object[]{ null , 0 } , new java.lang.Object[]{ 0 , 0 } , new java.lang.Object[]{ null , -1 } , new java.lang.Object[]{ -1 , null } };
}