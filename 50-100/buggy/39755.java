public int utility(chesspresso.position.Position position) {
    if (position.isStaleMate()) {
        return 0;
    }else
        if (position.isTerminal()) {
            if ((position.getToPlay()) == 0) {
                return (java.lang.Integer.MAX_VALUE) / 2;
            }else {
                return (java.lang.Integer.MIN_VALUE) / 2;
            }
        }else {
            return eval(position);
        }
    
}