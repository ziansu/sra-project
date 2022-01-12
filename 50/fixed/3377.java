@org.junit.Test
public void bigForResult() {
    java.lang.String xquery = "    for $i in (1 to 1*1000*1000)\n" + ((("    let $lv1 := 1000 * 100 * 100 * 1000 + 2234 + 7521 - 1.0 div 1.0 + 1024 div 3.1415926535\n" + "    where $i != 1\n") + "    return\n") + "        $i");
    assertEvalMillis(xquery, 200);
}