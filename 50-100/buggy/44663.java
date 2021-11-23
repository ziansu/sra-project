public static util.IntSet newIntSet() {
    util.IntSet set = null;
    switch (main.Main.SET_CHOICE) {
        case 1 :
            set = new util.IntSetSparseBits();
            break;
        case 2 :
            set = new util.IntSetTIntSet();
            break;
        case 3 :
            set = new util.IntSetTreeSet();
            break;
        default :
            set = new util.IntSetBits();
    }
    return set;
}