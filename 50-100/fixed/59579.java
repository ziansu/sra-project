@java.lang.Override
public java.lang.Object apply(java.util.List args) {
    if ((args.get(0).equals(lispy.Environment.FALSE)) && (args.get(1).equals(lispy.Environment.FALSE))) {
        return lispy.Environment.FALSE;
    }else {
        if (args.get(0).equals(lispy.Environment.FALSE)) {
            return args.get(1);
        }else {
            return args.get(0);
        }
    }
}