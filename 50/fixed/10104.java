@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T next() throws java.util.NoSuchElementException {
    final org.apache.poi.xssf.usermodel.XSSFSheet xssfSheet = it.next();
    return ((T) (getSXSSFSheet(xssfSheet)));
}