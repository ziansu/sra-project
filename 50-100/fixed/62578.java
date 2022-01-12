private void prompt(java.util.Scanner scan, boolean withDesc, net.arcanesanctuary.Configuration.Conf conf) {
    if ((withDesc == true) && (!(conf.getDesc().isEmpty()))) {
        java.lang.System.out.format("%s: ", conf.getDesc());
    }else {
        java.lang.System.out.format("%s: ", conf.getVar());
    }
    conf.setVal(scan.nextLine());
}