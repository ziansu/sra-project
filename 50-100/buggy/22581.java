public static java.lang.String F(java.lang.String x) {
    if (x.equals("(")) {
        x = formais2.z.alex(x);
        x = formais2.z.E(x);
        if (x.equals(")")) {
            x = formais2.z.alex(x);
            return x;
        }
        return x;
    }else
        if (x.equals("id")) {
            x = formais2.z.alex(x);
            return x;
        }
    
    formais2.z.error("esperava-se ) ou ( ou id  ");
    return x;
}