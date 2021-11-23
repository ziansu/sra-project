public static void main(java.lang.String[] args) {
    java.lang.String ip = "";
    if ((args.length) >= 1) {
        gomoku.Gomoku.IPaddress = ip;
        ip = args[0];
    }else {
        gomoku.Gomoku.IPaddress = ip;
        ip = "152.117.243.155";
    }
    gomoku.TitleViewController vc = new gomoku.TitleViewController(ip);
    gomoku.Gomoku.IPaddress = ip;
    vc.showView();
}