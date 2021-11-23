@com.smcmaster.selftest.annotations.Comparison(inputs = { "2" , "4" }, output = "7", description = "This test fails on purpose")
@com.smcmaster.selftest.annotations.Comparison(inputs = { "-5" , "10" }, output = "5")
public int sum(java.lang.Integer first, int second) {
    return first + second;
}