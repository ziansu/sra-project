public int HitOrStand(int i) {
    int x = i;
    java.lang.System.out.println("Hit or stand?");
    java.lang.System.out.println("1: Hit");
    java.lang.System.out.println("2: Stand");
    if ((cs1.Keyboard.readInt()) == 1) {
        x += drawCard();
        java.lang.System.out.println(x);
        if (x > 21) {
            return x;
        }else {
            return HitOrStand(x);
        }
    }else {
        return x;
    }
}