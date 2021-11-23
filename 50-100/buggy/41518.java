public static long substraction(IpV4Address minued, IpV4Address subtrahend) {
    try {
        return java.lang.Math.abs(((minued.getAdd()) - (subtrahend.getAdd())));
    } catch (java.lang.NullPointerException e) {
        if (minued == null) {
            return subtrahend.getAdd();
        }else
            if (subtrahend == null) {
                return minued.getAdd();
            }else
                return 0;
            
        
    }
}