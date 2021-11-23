public static void main(java.lang.String[] args) {
    KnightBoard x = new KnightBoard(7, 7);
    if ((args.length) > 2)
        x = new KnightBoard(java.lang.Integer.parseInt(args[0]), java.lang.Integer.parseInt(args[1]));
    
    x.p(x.stringify(x.spots(4, 4)));
}