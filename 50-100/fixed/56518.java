public static void confCsvFormat(java.lang.String format, org.apache.commons.csv.CSVFormat csvFormat) {
    if (format == null) {
        csvFormat = org.apache.commons.csv.CSVFormat.DEFAULT;
        return ;
    }
    switch (format) {
        case "excel" :
            csvFormat = org.apache.commons.csv.CSVFormat.EXCEL;
            break;
        case "mysql" :
            csvFormat = org.apache.commons.csv.CSVFormat.MYSQL;
            break;
        case "tdf" :
            csvFormat = org.apache.commons.csv.CSVFormat.TDF;
            break;
        case "rfc4180" :
            csvFormat = org.apache.commons.csv.CSVFormat.RFC4180;
            break;
        default :
            csvFormat = org.apache.commons.csv.CSVFormat.DEFAULT;
            break;
    }
}