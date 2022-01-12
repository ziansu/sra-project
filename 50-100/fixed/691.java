@org.junit.Test
public void testFloor() {
    for (int i = 1; i < (ninja.bladh.tools.MathToolTest.integers.length); i++) {
        int a = ninja.bladh.tools.MathToolTest.integers[(i - 1)];
        int b = ninja.bladh.tools.MathToolTest.integers[i];
        int result = ninja.bladh.tools.MathTool.floor(a, b);
        org.junit.Assert.assertEquals((((("Trying to floor " + a) + " and ") + b) + " is not producing the expected value"), ninja.bladh.tools.MathToolTest.floors[(i - 1)], result);
    }
}