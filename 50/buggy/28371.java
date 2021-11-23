public static void main(java.lang.String[] args) {
    java.lang.System.out.println(com.yangc.utils.prop.PropertiesUtils.getProperty("/jdbc.properties", "oracle.driver"));
    com.yangc.utils.prop.PropertiesUtils.setProperty("/email.properties", "name", "yangc");
}