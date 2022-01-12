public static java.lang.String convert(int n) {
    if ((CalcBase.Is.root(n)) == false) {
        int p = 1;
        while ((CalcBase.Is.root(n)) == false) {
            p *= n / (CalcBase.Find.factor(n));
        } 
    }else
        return java.lang.Integer.toString(n);
    
}