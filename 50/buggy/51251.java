public java.lang.String generateForm544SerialNo() {
    java.lang.String serialNoMonthPart = (form544Dao.getForm544CountForCurrentMonth()) + "";
    java.lang.String serialNoYearPart = (form544Dao.getForm544CountForCurrentYear()) + "";
    return (serialNoMonthPart + "/") + serialNoYearPart;
}