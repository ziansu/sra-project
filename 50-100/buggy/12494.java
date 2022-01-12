public void HitOrStand(Player x) {
    java.lang.System.out.println("Hit or stand?");
    java.lang.System.out.println("1: Hit");
    java.lang.System.out.println("2: Stand");
    if ((cs1.Keyboard.readInt()) == 1) {
        _playerTotal += drawCard();
        java.lang.System.out.println(_playerTotal);
        if ((_playerTotal) > 21) {
            x.lose(_bet);
            return ;
        }else {
            HitOrStand(x);
        }
    }else {
        return ;
    }
}