@org.testng.annotations.Parameters(value = { "producedAfter" , "diagonalFrom" , "diagonalTo" , "tvPriceUpTo" , "manufacturer" })
@org.testng.annotations.BeforeSuite
public void setUp(java.lang.String producedAfter, java.lang.String diagonalFrom, java.lang.String diagonalTo, java.lang.String tvPriceUpTo, java.lang.String manufacturer) {
    this.producedAfter = producedAfter;
    this.diagonalFrom = diagonalFrom;
    this.diagonalTo = diagonalTo;
    this.tvPriceUpTo = tvPriceUpTo;
    this.manufacturer = manufacturer;
}