public static void main(java.lang.String[] args) {
    mysql.LoadDriver load = new mysql.LoadDriver();
    load.connect("root", "UAPA2017");
    load.getConsolidateStudent("1000178793");
}