public static void main() throws java.lang.InterruptedException {
    int a = 2;
    com.laneve.asp.ASMAnalysis.tests.Tests x = new com.laneve.asp.ASMAnalysis.tests.Tests();
    com.laneve.asp.ASMAnalysis.tests.Tests y = new com.laneve.asp.ASMAnalysis.tests.Tests(a);
    com.laneve.asp.ASMAnalysis.tests.Tests z = new com.laneve.asp.ASMAnalysis.tests.Tests(y);
    x.fact(5);
    com.laneve.asp.ASMAnalysis.tests.Tests.swap(y, z);
    if (((x.fieldOne) - (z.fieldOne)) == 0)
        a += x.bar();
    
}