public static void main(java.lang.String[] args) {
    java.lang.String ip = "";
    if ((args.length) >= 1) {
        ip = args[0];
    }else {
        ip = "152.117.243.155";
    }
    gomoku.TitleViewController vc = new gomoku.TitleViewController(ip);
    gomoku.Gomoku.IPaddress = ip;
    vc.showView();
}