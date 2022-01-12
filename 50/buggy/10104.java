@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T next() throws java.util.NoSuchElementException {
    final org.apache.poi.xssf.usermodel.XSSFSheet xssfSheet = it.next();
    final T sxssfSheet = ((T) (getSXSSFSheet(xssfSheet)));
    return sxssfSheet;
}