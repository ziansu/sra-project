public static boolean CheckGetFileName() {
    netlife.datamodels.Commands com = new netlife.datamodels.Commands("ADD", "bilder/2012/1.jpg", "");
    netlife.datamodels.Commands com2 = new netlife.datamodels.Commands("DEL", "bilder/2012/1.jpg/", "");
    java.lang.String test = netlife.Logic.getFileName(com);
    java.lang.String test2 = netlife.Logic.getFileName(com2);
    boolean check = test.equals("1.jpg");
    boolean check2 = test2.equals("1.jpg");
    return (check && check2) == true;
}